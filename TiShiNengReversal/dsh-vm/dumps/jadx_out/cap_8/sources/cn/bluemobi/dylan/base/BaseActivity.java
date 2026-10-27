package cn.bluemobi.dylan.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private androidx.appcompat.widget.Toolbar O;
    private android.widget.FrameLayout P;
    private android.widget.TextView Q;
    private cn.bluemobi.dylan.base.BaseActivity.c R;
    private cn.bluemobi.dylan.base.BaseActivity.c S;
    private int T;
    private java.lang.String U;
    protected android.content.Context V;
    protected androidx.fragment.app.FragmentActivity W;
    private android.widget.Toast X;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ cn.bluemobi.dylan.base.BaseActivity a;

        a(cn.bluemobi.dylan.base.BaseActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // cn.bluemobi.dylan.base.BaseActivity.c
        public void onClick() {
                r1 = this;
                cn.bluemobi.dylan.base.BaseActivity r0 = r1.a
                r0.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ cn.bluemobi.dylan.base.BaseActivity a;

        b(cn.bluemobi.dylan.base.BaseActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // cn.bluemobi.dylan.base.BaseActivity.c
        public void onClick() {
                r1 = this;
                cn.bluemobi.dylan.base.BaseActivity r0 = r1.a
                r0.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void onClick();
    }

    public BaseActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.CharSequence O() {
            r1 = this;
            android.widget.TextView r0 = r1.Q
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    private void Q(android.os.IBinder r3) {
            r2 = this;
            if (r3 == 0) goto Le
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 2
            r0.hideSoftInputFromWindow(r3, r1)
        Le:
            return
    }

    private boolean U(android.view.View r7, android.view.MotionEvent r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L43
            boolean r1 = r7 instanceof android.widget.EditText
            if (r1 == 0) goto L43
            int[] r1 = new int[]{r0, r0}
            r7.getLocationInWindow(r1)
            r2 = r1[r0]
            r3 = 1
            r1 = r1[r3]
            int r4 = r7.getHeight()
            int r4 = r4 + r1
            int r7 = r7.getWidth()
            int r7 = r7 + r2
            float r5 = r8.getX()
            float r2 = (float) r2
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L42
            float r2 = r8.getX()
            float r7 = (float) r7
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L42
            float r7 = r8.getY()
            float r1 = (float) r1
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L42
            float r7 = r8.getY()
            float r8 = (float) r4
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L42
            return r0
        L42:
            return r3
        L43:
            return r0
    }

    private cn.bluemobi.dylan.base.BaseActivity V() {
            r2 = this;
            java.lang.Integer r0 = cn.bluemobi.dylan.base.a.a()
            if (r0 == 0) goto L1b
            java.lang.Integer r0 = cn.bluemobi.dylan.base.a.a()
            int r0 = r0.intValue()
            cn.bluemobi.dylan.base.BaseActivity r0 = r2.W(r0)
            cn.bluemobi.dylan.base.BaseActivity$a r1 = new cn.bluemobi.dylan.base.BaseActivity$a
            r1.<init>(r2)
            r0.X(r1)
            return r2
        L1b:
            int r0 = cn.bluemobi.dylan.base.R.drawable.ic_return_white_24dp
            cn.bluemobi.dylan.base.BaseActivity r0 = r2.W(r0)
            cn.bluemobi.dylan.base.BaseActivity$b r1 = new cn.bluemobi.dylan.base.BaseActivity$b
            r1.<init>(r2)
            r0.X(r1)
            return r2
    }

    public abstract void L();

    protected void M() {
            r0 = this;
            return
    }

    protected abstract int N();

    public android.widget.FrameLayout P() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.P
            return r0
    }

    public abstract void R();

    public abstract void S();

    public abstract void T(android.os.Bundle r1);

    protected cn.bluemobi.dylan.base.BaseActivity W(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.O
            r0.setNavigationIcon(r2)
            return r1
    }

    protected cn.bluemobi.dylan.base.BaseActivity X(cn.bluemobi.dylan.base.BaseActivity.c r1) {
            r0 = this;
            r0.R = r1
            return r0
    }

    protected cn.bluemobi.dylan.base.BaseActivity Y(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L8
            androidx.appcompat.widget.Toolbar r2 = r1.O
            r0 = 0
            r2.setNavigationIcon(r0)
        L8:
            return r1
    }

    protected cn.bluemobi.dylan.base.BaseActivity Z(int r1, cn.bluemobi.dylan.base.BaseActivity.c r2) {
            r0 = this;
            r0.T = r1
            r0.S = r2
            return r0
    }

    protected cn.bluemobi.dylan.base.BaseActivity a0(java.lang.String r1, int r2, cn.bluemobi.dylan.base.BaseActivity.c r3) {
            r0 = this;
            r0.T = r2
            r0.U = r1
            r0.S = r3
            return r0
    }

    protected cn.bluemobi.dylan.base.BaseActivity b0(java.lang.String r1, cn.bluemobi.dylan.base.BaseActivity.c r2) {
            r0 = this;
            r0.S = r2
            r0.U = r1
            return r0
    }

    protected cn.bluemobi.dylan.base.BaseActivity c0(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.O
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r0.setVisibility(r2)
            return r1
    }

    protected cn.bluemobi.dylan.base.BaseActivity d0(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.Q
            r0.setTextColor(r2)
            return r1
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 != 0) goto L17
            android.view.View r0 = r2.getCurrentFocus()
            boolean r1 = r2.U(r0, r3)
            if (r1 == 0) goto L17
            android.os.IBinder r0 = r0.getWindowToken()
            r2.Q(r0)
        L17:
            boolean r3 = super/*android.app.Activity*/.dispatchTouchEvent(r3)
            return r3
    }

    protected cn.bluemobi.dylan.base.BaseActivity e0(float r2) {
            r1 = this;
            android.widget.TextView r0 = r1.Q
            r0.setTextSize(r2)
            return r1
    }

    public void f0(java.lang.CharSequence r3) {
            r2 = this;
            android.widget.Toast r0 = r2.X
            if (r0 != 0) goto L13
            android.content.Context r0 = r2.V
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
            r2.X = r3
            r0 = 17
            r3.setGravity(r0, r1, r1)
            goto L16
        L13:
            r0.setText(r3)
        L16:
            android.widget.Toast r3 = r2.X
            r3.show()
            return
    }

    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(r4)
            r3.W = r3
            r3.V = r3
            r3.M()
            int r0 = cn.bluemobi.dylan.base.R.layout.ac_base_title_bar
            r3.setContentView(r0)
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            r0.c(r3)
            int r0 = cn.bluemobi.dylan.base.R.id.toolbar
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r3.O = r0
            int r0 = cn.bluemobi.dylan.base.R.id.viewContent
            android.view.View r0 = r3.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.P = r0
            int r0 = cn.bluemobi.dylan.base.R.id.tvTitle
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.Q = r0
            r0 = 1
            r3.setRequestedOrientation(r0)
            androidx.appcompat.widget.Toolbar r0 = r3.O
            r3.setSupportActionBar(r0)
            androidx.appcompat.app.ActionBar r0 = r3.getSupportActionBar()
            r1 = 0
            r0.setDisplayShowTitleEnabled(r1)
            r3.V()
            r3.S()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            int r1 = r3.N()
            android.widget.FrameLayout r2 = r3.P
            r0.inflate(r1, r2)
            r3.T(r4)
            r3.R()
            r3.L()
            return
    }

    public boolean onCreateOptionsMenu(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.T
            if (r0 != 0) goto Lc
            java.lang.String r0 = r2.U
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
        Lc:
            android.view.MenuInflater r0 = r2.getMenuInflater()
            int r1 = cn.bluemobi.dylan.base.R.menu.menu_base_title_bar
            r0.inflate(r1, r3)
        L15:
            r3 = 1
            return r3
    }

    protected void onDestroy() {
            r1 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            r0.h(r1)
            super.onDestroy()
            return
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r3) {
            r2 = this;
            int r0 = r3.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L11
            cn.bluemobi.dylan.base.BaseActivity$c r3 = r2.R
            if (r3 == 0) goto L20
            r3.onClick()
            goto L20
        L11:
            int r3 = r3.getItemId()
            int r0 = cn.bluemobi.dylan.base.R.id.menu_1
            if (r3 != r0) goto L20
            cn.bluemobi.dylan.base.BaseActivity$c r3 = r2.S
            if (r3 == 0) goto L20
            r3.onClick()
        L20:
            r3 = 1
            return r3
    }

    protected void onPause() {
            r1 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            android.widget.Toast r0 = r1.X
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }

    public boolean onPrepareOptionsMenu(android.view.Menu r3) {
            r2 = this;
            int r0 = cn.bluemobi.dylan.base.R.id.menu_1
            android.view.MenuItem r0 = r3.findItem(r0)
            int r1 = r2.T
            if (r1 == 0) goto Ld
            r0.setIcon(r1)
        Ld:
            java.lang.String r1 = r2.U
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1a
            java.lang.String r1 = r2.U
            r0.setTitle(r1)
        L1a:
            boolean r3 = super/*android.app.Activity*/.onPrepareOptionsMenu(r3)
            return r3
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            android.widget.TextView r0 = r1.Q
            r0.setText(r2)
        Lb:
            return
    }
}
