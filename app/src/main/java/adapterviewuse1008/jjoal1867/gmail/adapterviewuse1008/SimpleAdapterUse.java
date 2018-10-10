package adapterviewuse1008.jjoal1867.gmail.adapterviewuse1008;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_use);

        //SimpleAdapter를 이용해서 출력할 데이터를 생성
        //List<Map<String, Object>>구조
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("name","조아라");
        map.put("alias","조알");
        list.add(map);

        map = new HashMap<>();
        map.put("name","온지인");
        map.put("alias","온달");
        list.add(map);

        map = new HashMap<>();
        map.put("name","이수연");
        map.put("alias","닭둘기");
        list.add(map);

        //데이터 출력을 위한 Adapter 생성
        //첫번째 매개변수 : Context, 두번째 매개변수 : 데이터, 세번째 매개변수 : 셀의 출력모양
        //네번째 매개변수 : 데이터의 키 배열, 다섯번째 매개변수 : 출력할 셀 안의 id
        SimpleAdapter adapter = new SimpleAdapter(this,list,android.R.layout.simple_list_item_2,
                new String[]{"name","alias"},new int[]{android.R.id.text1,android.R.id.text2});

        //ListView에 adapter를 연결해서 출력
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter((adapter));

    }
}
