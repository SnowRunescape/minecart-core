package br.com.minecart.core.utilities;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import br.com.minecart.core.entities.Key;

public class Utils {
    public static String[] convertJsonArrayToStringArray(JsonArray jsonArray) {
        List<String> arrayList = new ArrayList<String>();

        for (JsonElement element : jsonArray) {
            arrayList.add(element.getAsString());
        }

        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static int[] convertKeysToIdArray(ArrayList<Key> keys) {
        int counter = 0;
        int quantity = keys.size();

        int[] ids = new int[quantity];

        for (Key key : keys) {
            ids[counter] = key.getId();
            counter++;
        }

        return ids;
    }
}
