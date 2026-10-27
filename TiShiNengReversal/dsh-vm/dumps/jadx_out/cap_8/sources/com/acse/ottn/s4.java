package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s4 {

    /* renamed from: b, reason: collision with root package name */
    public static com.acse.ottn.s4 f2655b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f2656c = "VideoSoftwareUtil";

    /* renamed from: d, reason: collision with root package name */
    public static android.os.CountDownTimer f2657d;
    public java.util.List<java.lang.String> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.s4 f2658b;

        public a(com.acse.ottn.s4 r1, android.view.accessibility.AccessibilityNodeInfo r2) {
                r0 = this;
                r0.f2658b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.n0.d
        @androidx.annotation.RequiresApi(api = 16)
        public void a(long r1) {
                r0 = this;
                com.acse.ottn.s4 r1 = r0.f2658b
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.a = r2
                com.acse.ottn.s4 r1 = r0.f2658b
                android.view.accessibility.AccessibilityNodeInfo r2 = r0.a
                r1.a(r2)
                com.acse.ottn.s4 r1 = r0.f2658b
                java.util.List<java.lang.String> r2 = r1.a
                boolean r1 = r1.a(r2)
                if (r1 == 0) goto L24
                android.os.CountDownTimer r1 = com.acse.ottn.s4.f2657d
                if (r1 == 0) goto L24
                r1.cancel()
                r1 = 0
                com.acse.ottn.s4.f2657d = r1
            L24:
                return
        }
    }

    static {
            return
    }

    public s4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.s4 a() {
            com.acse.ottn.s4 r0 = com.acse.ottn.s4.f2655b
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.s4> r0 = com.acse.ottn.s4.class
            monitor-enter(r0)
            com.acse.ottn.s4 r1 = com.acse.ottn.s4.f2655b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.s4 r1 = new com.acse.ottn.s4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.s4.f2655b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.s4 r0 = com.acse.ottn.s4.f2655b
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void a(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            if (r3 == 0) goto L26
            int r0 = r3.getChildCount()
            if (r0 != 0) goto L26
            java.lang.CharSequence r0 = r3.getText()
            if (r0 == 0) goto L3f
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L3f
            java.util.List<java.lang.String> r0 = r2.a
            r0.add(r3)
            return
        L26:
            if (r3 == 0) goto L3f
            r0 = 0
        L29:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L3f
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L3c
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            r2.a(r1)
        L3c:
            int r0 = r0 + 1
            goto L29
        L3f:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public void a(com.acse.ottn.service.ShopHelperService r4) {
            r3 = this;
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.getRootInActiveWindow()
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.s4$a r1 = new com.acse.ottn.s4$a
            r1.<init>(r3, r4)
            r4 = 3500(0xdac, float:4.905E-42)
            r2 = 1000(0x3e8, float:1.401E-42)
            android.os.CountDownTimer r4 = r0.a(r4, r2, r1)
            com.acse.ottn.s4.f2657d = r4
            r4.start()
            return
    }

    public boolean a(java.util.List<java.lang.String> r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L70
            int r1 = r6.size()
            if (r1 != 0) goto La
            goto L70
        La:
            r1 = 0
        Lb:
            int r2 = r6.size()
            if (r1 >= r2) goto L6f
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "合计:"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6c
            java.lang.String r2 = com.acse.ottn.s4.f2656c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.acse.ottn.h2.a(r2, r4)
            int r2 = r6.size()
            int r4 = r1 + 1
            if (r2 > r4) goto L40
            return r0
        L40:
            java.lang.Object r2 = r6.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L6c
            java.lang.String r0 = com.acse.ottn.s4.f2656c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.acse.ottn.h2.a(r0, r6)
            r6 = 1
            return r6
        L6c:
            int r1 = r1 + 1
            goto Lb
        L6f:
            return r0
        L70:
            java.lang.String r6 = com.acse.ottn.s4.f2656c
            java.lang.String r1 = "lists = null"
            com.acse.ottn.h2.a(r6, r1)
            return r0
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.s4 r0 = com.acse.ottn.s4.f2655b
            return r0
    }
}
