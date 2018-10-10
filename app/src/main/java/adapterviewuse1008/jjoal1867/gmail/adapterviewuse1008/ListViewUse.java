package adapterviewuse1008.jjoal1867.gmail.adapterviewuse1008;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListViewUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_use);

        //출력할 데이터 배열이나 List생성
        String [] food ={"떡볶이","찹쌀탕수육","순대국","족발"};

        //위의 데이터를 가지고 Adapter생성
        //첫번째 매개변9수 : Context / 두번째 매개변수 : 출력할셀의 모양 - 제공되는 모양사용 /세번째 매개변수 : 출력할 데이터
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,food);

        //ListView에 위의 Adapter 연결
        ListView listView = (ListView)findViewById(R.id.listView);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.food,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter1);


        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setDivider(new ColorDrawable(Color.BLUE));
        listView.setDividerHeight(3);


        listView.setOnItemClickListener(new ListView.OnItemClickListener(){
            @Override
            //첫번째 매개변수 : 이벤트가 발생한 객체 / 두번째 매개변수 : 항목 뷰 - 선택한 항목의 뷰
            //세번째 매개변수 : 클릭한 항목 뷰의 인덱스 / 네번째 매개변수 : 항목뷰의 아이디
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewUse.this,position+"번째 선택",Toast.LENGTH_LONG).show();
            }
        });
    }
}
