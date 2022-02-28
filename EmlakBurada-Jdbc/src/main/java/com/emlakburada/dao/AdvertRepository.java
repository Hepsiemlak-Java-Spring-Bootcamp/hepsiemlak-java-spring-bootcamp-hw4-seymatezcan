package com.emlakburada.dao;

import com.emlakburada.entity.Advert;
import com.emlakburada.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdvertRepository extends JdbcConnectionRepository {

    private static final String INSERT_ADVERT = "INSERT INTO ADVERT (ID, ADVERTDESCRIPTION, ADVERTTITLE) VALUES (?,?,?,?);";
    private static final String SELECT_ALL_ADVERT = "SELECT * FROM ADVERT";
    private static final String FIND_ADVERT = "SELECT * FROM ADVERT WHERE id = ?";

    public void save(Advert advert) {

        Connection connection = connect();

        if (connection != null) {

            PreparedStatement prepareStatement = null;
            try {

                prepareStatement = connection.prepareStatement(INSERT_ADVERT);
                prepareStatement.setInt(1, advert.id);
                prepareStatement.setString(2, advert.advertDescription);
                prepareStatement.setString(3, advert.advertTitle);

                int executeUpdate = prepareStatement.executeUpdate();

                System.out.println("result: " + executeUpdate);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                    prepareStatement.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Connection oluşturulamadı!");
        }

    }

    public List<Advert> findAll() {

        List<Advert> advertList = new ArrayList<Advert>();

        Connection connection = connect();

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(SELECT_ALL_ADVERT);

            ResultSet result = prepareStatement.executeQuery();

            while (result.next()) {

                int id = result.getInt("id");
                String advertDescription = result.getString("advertDescription");
                String advertTitle = result.getString("advertTitle");

                advertList.add(prepareAdvert(id, advertDescription,advertTitle));

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return advertList;

    }

    private Advert prepareAdvert(int id, String advertDescription, String advertTitle) {
        Advert advert=new Advert();

        advert.id = id;
        advert.advertDescription = advertDescription;
        advert.advertTitle = advertTitle;

        return advert;
    }

    public Advert findOne(int id) {

        Advert advert = null;

        Connection connection = connect();

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(FIND_ADVERT);
            prepareStatement.setInt(1, id);

            ResultSet result = prepareStatement.executeQuery();
            if (result.next()) {
                int userId = result.getInt("id");
                String advertDescription = result.getString("advertDescription");
                String advertTitle = result.getString("advertTitle");

                advert = prepareAdvert(id,advertDescription,advertTitle);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return advert;

    }


}
