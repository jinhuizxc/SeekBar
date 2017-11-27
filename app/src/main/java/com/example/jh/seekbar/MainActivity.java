package com.example.jh.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * 方法
 * setProgress(int value)    设置滑块的位置
 * setMax(int value)    设置进度条的最大长度
 * setOnSeekBarChangeListener(OnSeekBarCHangeListener l) 设置SeekBar的进度改变事件


 属性
 android:secondaryProgress[integer] 设置第二进度，通常用做显示视频等得缓冲效果
 android:thumb[drawable]设置滑块的图样
 android:progressDrawable[drawable]设置进度条的图样
 android:thumbOffset="0dip"   即可实现thumb滑块不被覆盖



 事件监听

 通过设置事件监听器setOnSeekBarChangeListener来获取SeekBar的当前状态，通常要监听以下3个事件

 1.public voidonProgressChanged(SeekBar seekBae,int progress,boolean fromUser); 用于监听SeekBar进度值的改变

 2.public voidonStartTrackingTouch(SeekBar seekBar);用于监听SeekBar开始拖动

 3.public voidonStopTrackingTouch(SeekBar seekBar);用于监听SeekBar停止拖动
 */
public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private EditText num;
    private SeekBar seekBar;
    private int minNum = 500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        num.setText(minNum + "");
        seekBar.setProgress(5000);
    }

    public void initView() {
        num = (EditText) findViewById(R.id.et_num);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
    }


    // 滚动时
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        minNum = 500 + progress;
        num.setText(minNum + "");
    }


    // 开始滚动
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }


    // 停止滚动
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
