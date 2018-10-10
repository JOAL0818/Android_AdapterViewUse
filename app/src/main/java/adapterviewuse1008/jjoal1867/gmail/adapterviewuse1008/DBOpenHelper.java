package adapterviewuse1008.jjoal1867.gmail.adapterviewuse1008;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {
    //생성자
    public DBOpenHelper(Context context) {
        //첫번째 매갲변수 : Context, 두번째 매개변수: 파일명
        //세번째 매개변수 : Cursor, 네번째 매개변수 : 버전
        super(context, "data.db", null, 1);
    }

    //데이터베이스를 처음 사용할 때 호출되는 메소드
    //테이블을 생성하고 샘플 데이터를 추가
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tb_data(_id integer primary key autoincrement, name text, alias text);");
        db.execSQL("insert into tb_data(name, alias) values('조아라','조알');");
        db.execSQL("insert into tb_data(name, alias) values('온지인','온달');");
        db.execSQL("insert into tb_data(name, alias) values('이수연','닭둘기');");
    }

    //버전이 변경되었을 때 호출되는 메소드
    //테이블을 삭제하고 다시 생성
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table tb_data");
        onCreate(db);
    }

}
