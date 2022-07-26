package kr.hs.emirim.s2125.mirim_project_0726_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.linear1);
        Button btn1 = findViewById(R.id.btn_bg);
        btn2 = findViewById(R.id.btn_change);

        registerForContextMenu(btn1); //롱클릭시 나타나게 contextmenu로 설정
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        switch (v.getId()){
            case R.id.btn_bg:
                menu.setHeaderTitle("배경색 변경");
                inflater.inflate(R.menu.contextmenu1,menu);
                break;
            case R.id.btn_change:
                menu.setHeaderTitle("버튼 변경");
                inflater.inflate(R.menu.contextmenu2,menu);
                break;
        }
    }
}