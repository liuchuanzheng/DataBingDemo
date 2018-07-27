package com.liuchuanzheng.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.liuchuanzheng.databindingdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //使用dataBinding总是报红。可能是因为开发工具不太支持的原因。不影响运行
        UserBean userBean = new UserBean("小明", 10);
        binding.setUser(userBean);
        binding.setAny("any");
        List<String> list = new ArrayList<String>();
        list.add("我是list的第一条");
        binding.setMyList(list);
        binding.setMyClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
            }
        });
        binding.setMyClass(new MyClass());


    }
    public class MyClass{
        public void onClickFriend(View view) {
            Toast.makeText(view.getContext(), "我是自定义方法。被调用了", Toast.LENGTH_SHORT).show();
        }
    }
}
