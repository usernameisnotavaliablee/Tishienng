package com.bxkj.base.keyboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.inputmethodservice.KeyboardView.OnKeyboardActionListener, android.widget.PopupWindow.OnDismissListener {
    private static final int g = 0;
    private static android.widget.PopupWindow h;
    protected android.inputmethodservice.Keyboard a;
    private android.view.View b;
    protected android.inputmethodservice.KeyboardView c;
    private android.app.Activity d;
    private com.bxkj.base.keyboard.c.a e;
    protected boolean f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    static {
            int r0 = com.bxkj.base.R.id.keyboard_view
            com.bxkj.base.keyboard.c.g = r0
            return
    }

    public c(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public c(android.app.Activity r3, android.widget.EditText r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f = r0
            r2.d = r3
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.widget.PopupWindow r0 = d(r0)
            com.bxkj.base.keyboard.c.h = r0
            r0.setOnDismissListener(r2)
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            android.view.View r0 = r0.getContentView()
            int r1 = com.bxkj.base.R.id.keyboard_view
            android.view.View r0 = r0.findViewById(r1)
            android.inputmethodservice.KeyboardView r0 = (android.inputmethodservice.KeyboardView) r0
            r2.c = r0
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            android.view.View r0 = r0.getContentView()
            int r1 = com.bxkj.base.R.id.keyboard_view_layout
            android.view.View r0 = r0.findViewById(r1)
            r2.b = r0
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            r1 = 1
            r0.setOutsideTouchable(r1)
            r2.j(r3)
            r2.a(r4)
            return
    }

    protected static android.widget.PopupWindow d(android.content.Context r5) {
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            if (r0 == 0) goto L5
            return r0
        L5:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            int r1 = com.bxkj.base.R.layout.keyboard_layout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.content.Context r1 = r5.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.widget.PopupWindow r2 = new android.widget.PopupWindow
            r3 = -2
            r4 = 1
            r2.<init>(r0, r1, r3, r4)
            r2.setInputMethodMode(r4)
            r0 = 16
            r2.setSoftInputMode(r0)
            r0 = 0
            r2.setFocusable(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r5 = r5.getResources()
            int r1 = com.bxkj.base.R.color.transparent
            int r5 = r5.getColor(r1)
            r0.<init>(r5)
            r2.setBackgroundDrawable(r0)
            int r5 = com.bxkj.base.R.style.keyboard_anim_style
            r2.setAnimationStyle(r5)
            return r2
    }

    public static android.graphics.Point e(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getSize(r0)
            return r0
    }

    public static android.graphics.Point g(android.content.Context r3) {
            android.graphics.Point r0 = e(r3)
            android.graphics.Point r3 = h(r3)
            int r1 = r0.x
            int r2 = r3.x
            if (r1 >= r2) goto L1b
            android.graphics.Point r1 = new android.graphics.Point
            int r3 = r3.x
            int r2 = r0.x
            int r3 = r3 - r2
            int r0 = r0.y
            r1.<init>(r3, r0)
            return r1
        L1b:
            int r1 = r0.y
            int r2 = r3.y
            if (r1 >= r2) goto L2e
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r0.x
            int r3 = r3.y
            int r0 = r0.y
            int r3 = r3 - r0
            r1.<init>(r2, r3)
            return r1
        L2e:
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            return r3
    }

    public static android.graphics.Point h(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getRealSize(r0)
            return r0
    }

    private static boolean l(int r1) {
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 == r0) goto L11
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 == r0) goto L11
            r0 = 18
            if (r1 != r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    public com.bxkj.base.keyboard.c a(android.widget.EditText r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L1e
        L3:
            r0 = 1
            r3.setCursorVisible(r0)
            r0 = 0
            r3.setSingleLine(r0)
            r3.setOnClickListener(r2)
            r3.setOnFocusChangeListener(r2)
            int r1 = r3.getInputType()
            boolean r1 = l(r1)
            if (r1 == 0) goto L1e
            r2.b(r3, r0)
        L1e:
            return r2
    }

    public com.bxkj.base.keyboard.c b(android.widget.EditText r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto La
            android.text.method.HideReturnsTransformationMethod r2 = android.text.method.HideReturnsTransformationMethod.getInstance()
            r1.setTransformationMethod(r2)
            return r0
        La:
            android.text.method.PasswordTransformationMethod r2 = android.text.method.PasswordTransformationMethod.getInstance()
            r1.setTransformationMethod(r2)
            return r0
    }

    public com.bxkj.base.keyboard.c c(boolean r2) {
            r1 = this;
            android.widget.EditText r0 = r1.f()
            if (r0 != 0) goto L7
            return r1
        L7:
            com.bxkj.base.keyboard.c r2 = r1.b(r0, r2)
            return r2
    }

    @androidx.annotation.Nullable
    protected android.widget.EditText f() {
            r2 = this;
            android.inputmethodservice.KeyboardView r0 = r2.c
            int r1 = com.bxkj.base.keyboard.c.g
            java.lang.Object r0 = r0.getTag(r1)
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 != 0) goto Lf
            goto L12
        Lf:
            android.widget.EditText r0 = (android.widget.EditText) r0
            return r0
        L12:
            r0 = 0
            return r0
    }

    public void i(android.widget.EditText r2) {
            r1 = this;
            android.view.View r2 = r1.b
            int r2 = r2.getVisibility()
            if (r2 == 0) goto Ld
            r0 = 4
            if (r2 != r0) goto Lc
            goto Ld
        Lc:
            return
        Ld:
            android.widget.PopupWindow r2 = com.bxkj.base.keyboard.c.h
            r2.dismiss()
            return
    }

    protected void j(android.app.Activity r3) {
            r2 = this;
            android.inputmethodservice.Keyboard r0 = new android.inputmethodservice.Keyboard
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            int r1 = com.bxkj.base.R.xml.keyboard_digs
            r0.<init>(r3, r1)
            r2.a = r0
            android.inputmethodservice.KeyboardView r3 = r2.c
            r3.setKeyboard(r0)
            android.inputmethodservice.KeyboardView r3 = r2.c
            r0 = 1
            r3.setEnabled(r0)
            android.inputmethodservice.KeyboardView r3 = r2.c
            r0 = 0
            r3.setPreviewEnabled(r0)
            android.inputmethodservice.KeyboardView r3 = r2.c
            r3.setOnKeyboardActionListener(r2)
            return
    }

    protected boolean k(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "0123456789"
            int r2 = r0.indexOf(r2)
            r0 = -1
            if (r2 <= r0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    protected boolean m(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyz"
            java.lang.String r2 = r2.toLowerCase()
            int r2 = r0.indexOf(r2)
            r0 = -1
            if (r2 <= r0) goto Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    protected boolean n(android.view.View r2) {
            r1 = this;
            android.content.Context r2 = r2.getContext()
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L11
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            boolean r2 = r2 instanceof android.app.Activity
            return r2
        L11:
            r2 = 0
            return r2
    }

    protected void o() {
            r11 = this;
            android.inputmethodservice.Keyboard r0 = r11.a
            java.util.List r0 = r0.getKeys()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Ld:
            int r4 = r0.size()
            if (r3 >= r4) goto L3b
            java.lang.Object r4 = r0.get(r3)
            android.inputmethodservice.Keyboard$Key r4 = (android.inputmethodservice.Keyboard.Key) r4
            java.lang.CharSequence r4 = r4.label
            if (r4 == 0) goto L38
            java.lang.Object r4 = r0.get(r3)
            android.inputmethodservice.Keyboard$Key r4 = (android.inputmethodservice.Keyboard.Key) r4
            java.lang.CharSequence r4 = r4.label
            java.lang.String r4 = r4.toString()
            boolean r4 = r11.k(r4)
            if (r4 == 0) goto L38
            java.lang.Object r4 = r0.get(r3)
            android.inputmethodservice.Keyboard$Key r4 = (android.inputmethodservice.Keyboard.Key) r4
            r1.add(r4)
        L38:
            int r3 = r3 + 1
            goto Ld
        L3b:
            int r0 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r5 = 0
        L4a:
            if (r5 >= r0) goto L6e
            com.bxkj.base.keyboard.a r6 = new com.bxkj.base.keyboard.a
            int r7 = r5 + 48
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r9 = ""
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.<init>(r7, r8)
            r4.add(r6)
            int r5 = r5 + 1
            goto L4a
        L6e:
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            r6 = 0
        L74:
            if (r6 >= r0) goto L9e
            int r7 = r0 - r6
            int r7 = r5.nextInt(r7)
            com.bxkj.base.keyboard.a r8 = new com.bxkj.base.keyboard.a
            java.lang.Object r9 = r4.get(r7)
            com.bxkj.base.keyboard.a r9 = (com.bxkj.base.keyboard.a) r9
            java.lang.Integer r9 = r9.a()
            java.lang.Object r10 = r4.get(r7)
            com.bxkj.base.keyboard.a r10 = (com.bxkj.base.keyboard.a) r10
            java.lang.String r10 = r10.b()
            r8.<init>(r9, r10)
            r3.add(r8)
            r4.remove(r7)
            int r6 = r6 + 1
            goto L74
        L9e:
            r0 = 0
        L9f:
            int r4 = r1.size()
            if (r0 >= r4) goto Ld2
            java.lang.Object r4 = r1.get(r0)
            android.inputmethodservice.Keyboard$Key r4 = (android.inputmethodservice.Keyboard.Key) r4
            java.lang.Object r5 = r3.get(r0)
            com.bxkj.base.keyboard.a r5 = (com.bxkj.base.keyboard.a) r5
            java.lang.String r5 = r5.b()
            r4.label = r5
            java.lang.Object r4 = r1.get(r0)
            android.inputmethodservice.Keyboard$Key r4 = (android.inputmethodservice.Keyboard.Key) r4
            int[] r4 = r4.codes
            java.lang.Object r5 = r3.get(r0)
            com.bxkj.base.keyboard.a r5 = (com.bxkj.base.keyboard.a) r5
            java.lang.Integer r5 = r5.a()
            int r5 = r5.intValue()
            r4[r2] = r5
            int r0 = r0 + 1
            goto L9f
        Ld2:
            android.inputmethodservice.KeyboardView r0 = r11.c
            android.inputmethodservice.Keyboard r1 = r11.a
            r0.setKeyboard(r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.r(r2)
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r3 = this;
            android.inputmethodservice.KeyboardView r0 = r3.c
            int r1 = com.bxkj.base.keyboard.c.g
            r2 = 0
            r0.setTag(r1, r2)
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View r6, boolean r7) {
            r5 = this;
            boolean r0 = r6 instanceof android.widget.EditText
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.EditText r6 = (android.widget.EditText) r6
            if (r7 == 0) goto L3c
            java.lang.Class<android.widget.EditText> r7 = android.widget.EditText.class
            r0 = 0
            java.lang.String r1 = "setShowSoftInputOnFocus"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L25
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L25
            r3[r0] = r4     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r7 = r7.getMethod(r1, r3)     // Catch: java.lang.Exception -> L25
            r7.setAccessible(r2)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L25
            r1[r0] = r2     // Catch: java.lang.Exception -> L25
            r7.invoke(r6, r1)     // Catch: java.lang.Exception -> L25
        L25:
            android.content.Context r7 = r6.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r7 = r7.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r7 = (android.view.inputmethod.InputMethodManager) r7
            android.os.IBinder r1 = r6.getWindowToken()
            r7.hideSoftInputFromWindow(r1, r0)
            r5.r(r6)
            return
        L3c:
            r5.i(r6)
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onKey(int r5, int[] r6) {
            r4 = this;
            android.widget.EditText r6 = r4.f()
            if (r6 != 0) goto L7
            goto L3d
        L7:
            android.text.Editable r0 = r6.getText()
            int r1 = r6.getSelectionStart()
            int r2 = r6.getSelectionEnd()
            r3 = -3
            if (r5 != r3) goto L1a
            r4.i(r6)
            return
        L1a:
            r3 = -99999999(0xfffffffffa0a1f01, float:-1.7929145E35)
            if (r5 != r3) goto L25
            java.lang.String r5 = ""
            r6.setText(r5)
            return
        L25:
            r6 = -5
            if (r5 != r6) goto L3e
            if (r1 != r2) goto L2c
            int r1 = r1 + (-1)
        L2c:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L3d
            if (r1 < 0) goto L3d
            int r5 = r0.length()
            if (r2 > r5) goto L3d
            r0.delete(r1, r2)
        L3d:
            return
        L3e:
            char r5 = (char) r5
            java.lang.String r5 = java.lang.Character.toString(r5)
            r0.insert(r1, r5)
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onPress(int r1) {
            r0 = this;
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onRelease(int r1) {
            r0 = this;
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onText(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public com.bxkj.base.keyboard.c p(com.bxkj.base.keyboard.c.a r1) {
            r0 = this;
            r0.e = r1
            return r0
    }

    public com.bxkj.base.keyboard.c q(boolean r1) {
            r0 = this;
            r0.f = r1
            return r0
    }

    public void r(@androidx.annotation.NonNull android.widget.EditText r5) {
            r4 = this;
            android.widget.EditText r0 = r4.f()
            if (r5 != r0) goto L8
            goto L9e
        L8:
            r4.i(r0)
            android.inputmethodservice.KeyboardView r0 = r4.c
            int r1 = com.bxkj.base.keyboard.c.g
            r0.setTag(r1, r5)
            android.view.View r0 = r4.b
            int r0 = r0.getVisibility()
            r1 = 8
            r2 = 0
            if (r0 == r1) goto L20
            r1 = 4
            if (r0 != r1) goto L25
        L20:
            android.view.View r0 = r4.b
            r0.setVisibility(r2)
        L25:
            boolean r0 = r4.f
            if (r0 == 0) goto L2c
            r4.o()
        L2c:
            android.os.IBinder r0 = r5.getWindowToken()
            if (r0 == 0) goto L9e
            boolean r0 = r0.isBinderAlive()
            if (r0 == 0) goto L9e
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = r5.getRootView()
            r1.getGlobalVisibleRect(r0)
            android.content.Context r0 = r5.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto L69
            boolean r0 = r4.n(r5)
            android.widget.PopupWindow r1 = com.bxkj.base.keyboard.c.h
            com.bxkj.base.keyboard.b.a(r1, r0)
        L69:
            android.app.Activity r0 = r4.d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getWidth()
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            r1 = 1
            r0.setTouchable(r1)
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            android.view.View r0 = r0.getContentView()
            r0.measure(r2, r2)
            android.widget.PopupWindow r0 = com.bxkj.base.keyboard.c.h
            android.view.View r0 = r0.getContentView()
            int r0 = r0.getMeasuredHeight()
            android.widget.PopupWindow r1 = com.bxkj.base.keyboard.c.h
            r3 = 81
            int r0 = -r0
            r1.showAtLocation(r5, r3, r2, r0)
            r5.requestFocus()
        L9e:
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeDown() {
            r0 = this;
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeLeft() {
            r0 = this;
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeRight() {
            r0 = this;
            return
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeUp() {
            r0 = this;
            return
    }
}
