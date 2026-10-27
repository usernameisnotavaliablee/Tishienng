package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i {
    private android.content.Context a;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b;
    final java.text.DateFormat c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ android.widget.TextView a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;
        final /* synthetic */ com.bxkj.base.util.i.c e;
        final /* synthetic */ com.bxkj.base.util.i f;

        a(com.bxkj.base.util.i r1, android.widget.TextView r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.bxkj.base.util.i.c r6) {
                r0 = this;
                r0.f = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r9) {
                r8 = this;
                com.bxkj.base.util.i r0 = r8.f
                java.lang.String r1 = "data"
                java.lang.Object r9 = r9.get(r1)
                java.util.List r9 = (java.util.List) r9
                com.bxkj.base.util.i.d(r0, r9)
                com.bxkj.base.util.i r1 = r8.f
                android.widget.TextView r2 = r8.a
                java.lang.String r3 = r8.b
                java.util.List r4 = com.bxkj.base.util.i.c(r1)
                java.lang.String r5 = r8.c
                java.lang.String r6 = r8.d
                com.bxkj.base.util.i$c r7 = r8.e
                r1.h(r2, r3, r4, r5, r6, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a(java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3);
    }

    public i(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.b = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            r2.c = r0
            r2.a = r3
            return
    }

    public static /* synthetic */ void a(java.util.List r0, java.lang.String r1, android.widget.TextView r2, java.lang.String[] r3, com.bxkj.base.util.i.c r4, android.content.DialogInterface r5, int r6) {
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
            r2.setTag(r1)
            r3 = r3[r6]
            r2.setText(r3)
            if (r4 == 0) goto L17
            r4.a(r1, r3, r0)
        L17:
            return
    }

    public static /* synthetic */ void b(com.bxkj.base.util.i r0, android.widget.TextView r1, com.bxkj.base.util.i.b r2, android.widget.DatePicker r3, int r4, int r5, int r6) {
            r0.f(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* bridge */ /* synthetic */ java.util.List c(com.bxkj.base.util.i r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ void d(com.bxkj.base.util.i r0, java.util.List r1) {
            r0.b = r1
            return
    }

    private void e(android.app.Dialog r4, int r5) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "android:id/titleDivider"
            r2 = 0
            int r0 = r0.getIdentifier(r1, r2, r2)
            android.view.View r4 = r4.findViewById(r0)
            if (r4 == 0) goto L18
            r4.setBackgroundColor(r5)
        L18:
            return
    }

    private /* synthetic */ void f(android.widget.TextView r1, com.bxkj.base.util.i.b r2, android.widget.DatePicker r3, int r4, int r5, int r6) {
            r0 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = "-"
            r3.append(r4)
            int r5 = r5 + 1
            r3.append(r5)
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.text.DateFormat r4 = r0.c     // Catch: java.text.ParseException -> L27
            java.util.Date r5 = r4.parse(r3)     // Catch: java.text.ParseException -> L27
            java.lang.String r3 = r4.format(r5)     // Catch: java.text.ParseException -> L27
            goto L28
        L27:
        L28:
            r1.setText(r3)
            if (r2 == 0) goto L30
            r2.a(r3)
        L30:
            return
    }

    public void g(android.widget.TextView r9, com.bxkj.base.util.i.b r10) {
            r8 = this;
            java.util.Locale r0 = java.util.Locale.CHINA
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setTime(r1)
            r1 = 1
            int r5 = r0.get(r1)
            r1 = 2
            int r6 = r0.get(r1)
            r1 = 5
            int r7 = r0.get(r1)
            android.app.DatePickerDialog r2 = new android.app.DatePickerDialog
            android.content.Context r3 = r8.a
            com.bxkj.base.util.h r4 = new com.bxkj.base.util.h
            r4.<init>(r8, r9, r10)
            r2.<init>(r3, r4, r5, r6, r7)
            r2.show()
            return
    }

    public com.bxkj.base.util.i h(android.widget.TextView r5, java.lang.String r6, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r7, java.lang.String r8, java.lang.String r9, com.bxkj.base.util.i.c r10) {
            r4 = this;
            int r0 = r7.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L7:
            int r2 = r7.size()
            if (r1 >= r2) goto L1c
            java.lang.Object r2 = r7.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r2 = cn.bluemobi.dylan.base.utils.u.O(r2, r9)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L1c:
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            android.content.Context r9 = r4.a
            r1.<init>(r9)
            android.content.Context r9 = r4.a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r2 = com.bxkj.base.R.layout.dialog_title
            r3 = 0
            android.view.View r9 = r9.inflate(r2, r3)
            int r2 = com.bxkj.base.R.id.tvTitle
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r6)
            r1.setCustomTitle(r9)
            r6 = r7
            r7 = r8
            r8 = r5
            com.bxkj.base.util.g r5 = new com.bxkj.base.util.g
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r1.setItems(r9, r5)
            androidx.appcompat.app.AlertDialog r5 = r1.create()
            r5.show()
            java.lang.String r6 = "#999999"
            int r6 = android.graphics.Color.parseColor(r6)
            r4.e(r5, r6)
            return r4
    }

    public com.bxkj.base.util.i i(android.widget.TextView r8, java.lang.String r9, rx.e<retrofit2.c0<okhttp3.ResponseBody>> r10, com.bxkj.base.util.i.c r11) {
            r7 = this;
            java.lang.String r4 = "id"
            java.lang.String r5 = "name"
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.j(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public com.bxkj.base.util.i j(android.widget.TextView r9, java.lang.String r10, rx.e<retrofit2.c0<okhttp3.ResponseBody>> r11, java.lang.String r12, java.lang.String r13, com.bxkj.base.util.i.c r14) {
            r8 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1 = r8.b
            if (r1 == 0) goto L16
            int r1 = r1.size()
            if (r1 <= 0) goto L16
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r8.b
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.h(r1, r2, r3, r4, r5, r6)
            return r8
        L16:
            android.content.Context r1 = r8.a
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            cn.bluemobi.dylan.http.HttpRequest r7 = r1.setObservable(r11)
            com.bxkj.base.util.i$a r0 = new com.bxkj.base.util.i$a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.setDataListener(r0)
            return r8
    }
}
