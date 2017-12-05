package org.fossasia.openevent.fragments;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

class MysqlCon extends AsyncTask<String, Boolean, String> {
    // you may separate this or combined to caller class.

    // you may separate this or combined to caller class.
    public interface AsyncResponse {
        void processFinish(String output);
    }

    public AsyncResponse delegate = null;

    public MysqlCon(AsyncResponse delegate){
        this.delegate = delegate;
    }

    @Override
    protected void onPostExecute(String result) {
        delegate.processFinish(result);
    }
    @Override
    protected String doInBackground(String... urls) {
        String response = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://opensource4pic.org/masters17_indiadb","root","79TLW-bb-bb");
            // System.out.println("Database connection success");

            String result = "Database connection success\n";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT `EMAIL` FROM `ATTENDEE`");
            ResultSetMetaData rsmd = rs.getMetaData();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return response;


    }
}