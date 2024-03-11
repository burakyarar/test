package D_45;

import D_44.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry: ogrenciEntrySeti
             ) {

            String eachValue = eachEntry.getValue();
            String[] valueArr = eachValue.split("-");

            if (valueArr[3].equalsIgnoreCase("H")){
                valueArr[3] = "T";
            }

            String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" +valueArr[4];

            eachEntry.setValue(yeniValue);

        }

        System.out.println(ogrenciMap);

    }
}
