package edu.eci.arsw.weather.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConectionService{
    public ConectionService(){}
    public JSONObject getWeatherByCity(String city) throws UnirestException {
            HttpResponse<String> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=dc051f82ace53cff9d23ae69be77fcc0")
                    .asString();
            return new JSONObject(response.getBody());
        }

}