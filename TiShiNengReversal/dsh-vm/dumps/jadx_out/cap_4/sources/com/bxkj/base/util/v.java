package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class v {
    public static final int a = 111;
    public static final int b = 222;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ android.app.Activity b;

        a(boolean r1, android.app.Activity r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1.dismiss()
                boolean r1 = r0.a
                if (r1 == 0) goto Lc
                android.app.Activity r1 = r0.b
                r1.finish()
            Lc:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ android.app.Activity a;

        b(android.app.Activity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.app.Activity r1 = r0.a
                com.bxkj.base.util.v.o(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a();

        void b(java.lang.String... r1);

        void c(java.lang.String... r1);
    }

    public v() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r1, java.lang.String[] r2, int r3) {
            java.util.List r2 = c(r1, r2)
            int r0 = r2.size()
            if (r0 <= 0) goto Ld
            l(r1, r2, r3)
        Ld:
            return
    }

    public static void b(android.content.Context r1, java.lang.String r2, int r3) {
            boolean r0 = f(r1, r2)
            if (r0 != 0) goto L9
            m(r1, r2, r3)
        L9:
            return
    }

    public static java.util.List<java.lang.String> c(android.content.Context r3, java.lang.String[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            boolean r2 = f(r3, r2)
            if (r2 != 0) goto L16
            r2 = r4[r1]
            r0.add(r2)
        L16:
            int r1 = r1 + 1
            goto L6
        L19:
            return r0
    }

    public static void d(android.content.Context r3, java.lang.String[] r4, com.bxkj.base.util.v.c r5) {
            java.util.List r4 = c(r3, r4)
            int r0 = r4.size()
            if (r0 != 0) goto Le
            r5.a()
            return
        Le:
            r0 = 0
            r1 = 0
        L10:
            int r2 = r4.size()
            if (r1 >= r2) goto L26
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = i(r3, r2)
            if (r2 == 0) goto L23
            goto L27
        L23:
            int r1 = r1 + 1
            goto L10
        L26:
            r0 = 1
        L27:
            int r3 = r4.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            if (r0 == 0) goto L39
            r5.c(r3)
            return
        L39:
            r5.b(r3)
            return
    }

    public static void e(android.content.Context r1, java.lang.String r2, com.bxkj.base.util.v.c r3) {
            boolean r0 = f(r1, r2)
            if (r0 == 0) goto La
            r3.a()
            return
        La:
            boolean r1 = i(r1, r2)
            if (r1 == 0) goto L18
            java.lang.String[] r1 = new java.lang.String[]{r2}
            r3.c(r1)
            return
        L18:
            java.lang.String[] r1 = new java.lang.String[]{r2}
            r3.b(r1)
            return
    }

    public static boolean f(android.content.Context r0, java.lang.String r1) {
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean g(int[] r2) {
            int r0 = r2.length
            r1 = 0
            if (r0 <= 0) goto La
            r2 = r2[r1]
            if (r2 != 0) goto La
            r2 = 1
            return r2
        La:
            return r1
    }

    public static void h(android.app.Activity r3, java.lang.String[] r4, boolean r5) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L47
            r1 = r4[r0]
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L14
            java.lang.String r4 = "存储"
            n(r3, r4, r5)
            return
        L14:
            r1 = r4[r0]
            java.lang.String r2 = "android.permission.CAMERA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L24
            java.lang.String r4 = "相机"
            n(r3, r4, r5)
            return
        L24:
            r1 = r4[r0]
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L34
            java.lang.String r4 = "通讯录"
            n(r3, r4, r5)
            return
        L34:
            r1 = r4[r0]
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L44
            java.lang.String r4 = "麦克风"
            n(r3, r4, r5)
            return
        L44:
            int r0 = r0 + 1
            goto L1
        L47:
            return
    }

    public static boolean i(android.content.Context r0, java.lang.String r1) {
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r0, r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static void j(android.content.Context r3, java.lang.String[] r4, com.bxkj.base.util.v.c r5) {
            java.util.List r0 = c(r3, r4)
            int r1 = r0.size()
            if (r1 != 0) goto Le
            r5.a()
            return
        Le:
            r1 = 0
        Lf:
            int r2 = r0.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = i(r3, r2)
            if (r2 != 0) goto L25
            r5.b(r4)
            return
        L25:
            int r1 = r1 + 1
            goto Lf
        L28:
            r5.c(r4)
            return
    }

    public static void k(android.content.Context r0, java.lang.String r1, int[] r2, com.bxkj.base.util.v.c r3) {
            boolean r2 = g(r2)
            if (r2 == 0) goto La
            r3.a()
            return
        La:
            boolean r0 = i(r0, r1)
            if (r0 == 0) goto L18
            java.lang.String[] r0 = new java.lang.String[]{r1}
            r3.c(r0)
            return
        L18:
            java.lang.String[] r0 = new java.lang.String[]{r1}
            r3.b(r0)
            return
    }

    public static void l(android.content.Context r1, java.util.List r2, int r3) {
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            android.app.Activity r1 = (android.app.Activity) r1
            androidx.core.app.ActivityCompat.requestPermissions(r1, r2, r3)
            return
    }

    public static void m(android.content.Context r0, java.lang.String r1, int r2) {
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String[] r1 = new java.lang.String[]{r1}
            androidx.core.app.ActivityCompat.requestPermissions(r0, r1, r2)
            return
    }

    public static void n(android.app.Activity r3, java.lang.String r4, boolean r5) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "权限不可用"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "请在设置中打开"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "权限"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.app.AlertDialog$Builder r4 = r0.setMessage(r4)
            com.bxkj.base.util.v$b r0 = new com.bxkj.base.util.v$b
            r0.<init>(r3)
            java.lang.String r1 = "立即开启"
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r1, r0)
            com.bxkj.base.util.v$a r0 = new com.bxkj.base.util.v$a
            r0.<init>(r5, r3)
            java.lang.String r3 = "取消"
            android.app.AlertDialog$Builder r3 = r4.setNegativeButton(r3, r0)
            r4 = 0
            android.app.AlertDialog$Builder r3 = r3.setCancelable(r4)
            r3.show()
            return
    }

    public static void o(android.app.Activity r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = r4.getPackageName()
            r2 = 0
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            r0.setData(r1)
            r1 = 222(0xde, float:3.11E-43)
            r4.startActivityForResult(r0, r1)
            return
    }

    public static void p(androidx.fragment.app.FragmentActivity r4, t.b.a r5) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = r4.getPackageName()
            r2 = 0
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            r0.setData(r1)
            t.b r1 = new t.b
            r1.<init>(r4)
            t.b r4 = r1.startActivityForResult(r0)
            t.b r4 = r4.startActivityForResult(r0)
            r4.c(r5)
            return
    }
}
