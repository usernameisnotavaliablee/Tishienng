package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SearchView extends android.widget.LinearLayout implements android.text.TextWatcher, android.view.View.OnClickListener {
    private android.widget.EditText a;
    private android.widget.Button b;
    private com.bxkj.base.view.SearchView.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1);
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.bxkj.base.R.layout.pub_searchview
            r0 = 1
            r2.inflate(r3, r1, r0)
            int r2 = com.bxkj.base.R.id.et_search
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.a = r2
            int r2 = com.bxkj.base.R.id.bt_clear
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.b = r2
            r3 = 8
            r2.setVisibility(r3)
            android.widget.EditText r2 = r1.a
            r2.addTextChangedListener(r1)
            android.widget.Button r2 = r1.b
            r2.setOnClickListener(r1)
            android.widget.EditText r2 = r1.a
            com.bxkj.base.view.a r3 = new com.bxkj.base.view.a
            r3.<init>(r1)
            r2.setOnEditorActionListener(r3)
            return
    }

    public static /* synthetic */ boolean a(com.bxkj.base.view.SearchView r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.b(r1, r2, r3)
            return r0
    }

    private /* synthetic */ boolean b(android.widget.TextView r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            r2 = 0
            if (r4 == 0) goto L3b
            int r3 = r4.getKeyCode()
            r0 = 66
            if (r3 != r0) goto L3b
            int r3 = r4.getAction()
            r4 = 1
            if (r3 != r4) goto L3a
            android.widget.EditText r3 = r1.a
            android.content.Context r3 = r3.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            android.widget.EditText r0 = r1.a
            android.os.IBinder r0 = r0.getWindowToken()
            r3.hideSoftInputFromWindow(r0, r2)
            com.bxkj.base.view.SearchView$a r2 = r1.c
            if (r2 == 0) goto L3a
            android.widget.EditText r3 = r1.a
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.a(r3)
        L3a:
            return r4
        L3b:
            return r2
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r2) {
            r1 = this;
            android.widget.EditText r2 = r1.a
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1c
            android.widget.Button r2 = r1.b
            r0 = 8
            r2.setVisibility(r0)
            return
        L1c:
            android.widget.Button r2 = r1.b
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.widget.EditText r2 = r1.a
            java.lang.String r0 = ""
            r2.setText(r0)
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            com.bxkj.base.view.SearchView$a r2 = r0.c
            if (r2 == 0) goto Lb
            java.lang.String r1 = r1.toString()
            r2.a(r1)
        Lb:
            return
    }

    public void setOnSearchListener(com.bxkj.base.view.SearchView.a r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
