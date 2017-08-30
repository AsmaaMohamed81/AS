package com.example.elashry.aseer.dataProccess;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;



public class JsonParser {

    ArrayList<DataEncap> data;

    public ArrayList<DataEncap> JsonProcess(String jsonFile) {

        data = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonFile);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject mainObjectArray = jsonArray.getJSONObject(i);

                DataEncap encap = new DataEncap(
                        mainObjectArray.getString(KeyTags.imgKey), mainObjectArray.getString(KeyTags.dateKey), mainObjectArray.getString(KeyTags.descKey), mainObjectArray.getString(KeyTags.titleKey));

                data.add(encap);

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }
    public ArrayList<DataEncap> JsonProcesstable(String jsonFile) {

        data = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonFile);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject mainObjectArray = jsonArray.getJSONObject(i);

                DataEncap enca = new DataEncap(
                        mainObjectArray.getString(KeyTags.img_Key), mainObjectArray.getString(KeyTags.titKey));
               data.add(enca);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }
    public ArrayList<DataEncap> JsonProcesslogin(String jsonFile) {

        data = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonFile);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject mainObjectArray = jsonArray.getJSONObject(i);

                DataEncap encap = new DataEncap(
                        mainObjectArray.getString( mainObjectArray.getString(KeyTags.id)));
                data.add(encap);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }
    public ArrayList<DataEncap> JsonProcessexams(String jsonFile) {

        data = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonFile);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject mainObjectArray = jsonArray.getJSONObject(i);

                DataEncap enca = new DataEncap(
                        mainObjectArray.getString(KeyTags.sname),mainObjectArray.getString(KeyTags.exame), mainObjectArray.getString(KeyTags.subject),mainObjectArray.getString(KeyTags.month), mainObjectArray.getString(KeyTags.max),mainObjectArray.getString(KeyTags.min));
                data.add(enca);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }
    public ArrayList<DataEncap> JsonProcesswork(String jsonFile) {

        data = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonFile);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject mainObjectArray = jsonArray.getJSONObject(i);

                DataEncap enca = new DataEncap(
                        mainObjectArray.getString(KeyTags.imgwork),mainObjectArray.getString(KeyTags.wid));
                data.add(enca);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }

    public ArrayList<DataEncap> JsonProcessAbsent(String jsonFile) {

        data = new ArrayList<>();

        try {

            JSONArray jsonArray = new JSONArray(jsonFile);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject mainObjectArray = jsonArray.getJSONObject(i);

                DataEncap enca = new DataEncap(
                        mainObjectArray.getString(KeyTags.sudname),mainObjectArray.getString(KeyTags.attstatue),mainObjectArray.getString(KeyTags.absentdate));
                data.add(enca);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return data;
    }

    public ArrayList<DataEncap> getlist() {
        return data;
    }
}
