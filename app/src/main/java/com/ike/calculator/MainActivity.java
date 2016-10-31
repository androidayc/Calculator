package com.ike.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @BindViews({R2.id.zero, R2.id.one, R2.id.three, R2.id.four, R2.id.five, R2.id.six, R2.id.seven, R2.id.eight, R.id.nine})
    Button[] btn = new Button[10];
    @BindView(R2.id.input)
    EditText input;
    @BindView(R2.id.men)
    TextView men;
    @BindView(R2.id._drg)
    TextView _drg;
    @BindView(R2.id.tip)
    TextView tip;
    @BindView(R2.id.mul) Button mul; @BindView(R2.id.divide) Button div;
    @BindView(R2.id.add) Button add; @BindView(R2.id.sub) Button sub;
    @BindView(R2.id.equal) Button equal; @BindView(R2.id.sin) Button sin;
    @BindView(R2.id.cos) Button cos; @BindView(R2.id.tan) Button tan;
    @BindView(R2.id.log) Button log; @BindView(R2.id.ln) Button ln;
    @BindView(R2.id.sqrt) Button sqrt; @BindView(R2.id.square) Button square;
    @BindView(R2.id.factorial) Button factorial; @BindView(R2.id.bksp) Button bksp;
    @BindView(R2.id.left) Button left; @BindView(R2.id.right) Button right;
    @BindView(R2.id.dot) Button dot; @BindView(R2.id.exit) Button exit;
    @BindView(R2.id.drg) Button drg; @BindView(R2.id.mc) Button mc;
    @BindView(R2.id.c) Button c;

    public String str_old;
    public String str_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
