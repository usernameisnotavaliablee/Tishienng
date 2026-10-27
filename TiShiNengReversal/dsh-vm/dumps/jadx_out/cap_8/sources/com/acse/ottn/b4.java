package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b4 {
    public static java.lang.String m = "ScreenLock_Width";
    public static java.lang.String n = "ScreenLock_Height";
    public static java.lang.String o = "ScreenLock_PositionX";
    public static java.lang.String p = "ScreenLock_PositionY";
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2164b;

    /* renamed from: c, reason: collision with root package name */
    public int f2165c;

    /* renamed from: d, reason: collision with root package name */
    public int f2166d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f2167e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.admin.DevicePolicyManager f2168f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.SharedPreferences f2169g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.WindowManager f2170h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.DisplayMetrics f2171i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f2172j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f2173k;
    public android.view.View l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public long a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.b4 f2174b;

        public a(com.acse.ottn.b4 r3) {
                r2 = this;
                r2.f2174b = r3
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2.a = r0
                return
        }
    }

    static {
            return
    }

    public b4(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.f2167e = r4
            java.lang.String r0 = "device_policy"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0
            r3.f2168f = r0
            java.lang.String r0 = "window"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r3.f2170h = r0
            java.lang.String r0 = r4.getPackageName()
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)
            r3.f2169g = r4
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            r3.f2171i = r4
            android.view.WindowManager r4 = r3.f2170h
            android.view.Display r4 = r4.getDefaultDisplay()
            android.util.DisplayMetrics r0 = r3.f2171i
            r4.getRealMetrics(r0)
            android.content.SharedPreferences r4 = r3.f2169g
            java.lang.String r0 = com.acse.ottn.b4.m
            android.util.DisplayMetrics r1 = r3.f2171i
            int r1 = r1.widthPixels
            int r1 = r1 / 20
            int r4 = r4.getInt(r0, r1)
            r3.a = r4
            android.content.SharedPreferences r4 = r3.f2169g
            java.lang.String r0 = com.acse.ottn.b4.n
            android.util.DisplayMetrics r1 = r3.f2171i
            int r1 = r1.widthPixels
            int r1 = r1 / 20
            int r4 = r4.getInt(r0, r1)
            r3.f2164b = r4
            android.content.SharedPreferences r4 = r3.f2169g
            java.lang.String r0 = com.acse.ottn.b4.o
            android.util.DisplayMetrics r1 = r3.f2171i
            int r1 = r1.widthPixels
            int r2 = r3.a
            int r1 = r1 - r2
            int r4 = r4.getInt(r0, r1)
            r3.f2165c = r4
            android.content.SharedPreferences r4 = r3.f2169g
            java.lang.String r0 = com.acse.ottn.b4.p
            android.util.DisplayMetrics r1 = r3.f2171i
            int r1 = r1.heightPixels
            int r2 = r3.f2164b
            int r1 = r1 - r2
            int r4 = r4.getInt(r0, r1)
            r3.f2166d = r4
            return
    }

    public void a() {
            r3 = this;
            android.widget.ImageView r0 = r3.f2172j
            if (r0 == 0) goto L5
            return
        L5:
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r3.f2173k = r0
            r1 = 2032(0x7f0, float:2.847E-42)
            r0.type = r1
            r1 = 776(0x308, float:1.087E-42)
            r0.flags = r1
            r1 = -2
            r0.format = r1
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r0.gravity = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.alpha = r1
            int r1 = r3.a
            r0.width = r1
            int r1 = r3.f2164b
            r0.height = r1
            int r1 = r3.f2165c
            r0.x = r1
            int r1 = r3.f2166d
            r0.y = r1
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r3.f2167e
            r0.<init>(r1)
            r3.f2172j = r0
            r1 = 0
            r0.setBackgroundColor(r1)
            com.acse.ottn.b4$a r0 = new com.acse.ottn.b4$a
            r0.<init>(r3)
            android.widget.ImageView r1 = r3.f2172j
            r1.setOnClickListener(r0)
            android.view.WindowManager r0 = r3.f2170h
            android.widget.ImageView r1 = r3.f2172j
            android.view.WindowManager$LayoutParams r2 = r3.f2173k
            r0.addView(r1, r2)
            return
    }
}
