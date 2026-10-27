package com.autonavi.aps.amapapi.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a.C0093a>> a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5784b;

    /* renamed from: c, reason: collision with root package name */
    long f5785c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f5786d;

    /* renamed from: e, reason: collision with root package name */
    com.autonavi.aps.amapapi.restruct.d f5787e;

    /* renamed from: f, reason: collision with root package name */
    boolean f5788f;

    /* renamed from: g, reason: collision with root package name */
    boolean f5789g;

    /* renamed from: h, reason: collision with root package name */
    java.lang.String f5790h;

    /* renamed from: i, reason: collision with root package name */
    private long f5791i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5792j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f5793k;
    private java.lang.String l;
    private java.lang.String m;
    private long n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.autonavi.aps.amapapi.storage.a$a, reason: collision with other inner class name */
    static class C0093a {
        private com.autonavi.aps.amapapi.model.a a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f5794b;

        protected C0093a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r1.f5794b = r0
                return
        }

        public final com.autonavi.aps.amapapi.model.a a() {
                r1 = this;
                com.autonavi.aps.amapapi.model.a r0 = r1.a
                return r0
        }

        public final void a(com.autonavi.aps.amapapi.model.a r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public final void a(java.lang.String r3) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto La
                r3 = 0
                r2.f5794b = r3
                return
            La:
                java.lang.String r0 = "##"
                java.lang.String r1 = "#"
                java.lang.String r3 = r3.replace(r0, r1)
                r2.f5794b = r3
                return
        }

        public final java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.f5794b
                return r0
        }
    }

    public a() {
            r5 = this;
            r5.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r5.a = r0
            r0 = 0
            r5.f5791i = r0
            r2 = 0
            r5.f5792j = r2
            java.lang.String r2 = "."
            java.lang.String r3 = ""
            java.lang.String r4 = "2.0.201501131131"
            java.lang.String r2 = r4.replace(r2, r3)
            r5.f5793k = r2
            r2 = 0
            r5.l = r2
            r3 = 1
            r5.f5784b = r3
            r5.f5785c = r0
            r5.f5786d = r2
            r5.f5787e = r2
            r5.m = r2
            r5.n = r0
            r5.f5788f = r3
            r5.f5789g = r3
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.DEFAULT
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.f5790h = r0
            return
    }

    private com.autonavi.aps.amapapi.model.a a(java.lang.String r5, java.lang.StringBuilder r6, boolean r7) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "cgiwifi"
            boolean r1 = r5.contains(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L44
            java.lang.String r1 = "wifi"
            boolean r1 = r5.contains(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L12
            goto L44
        L12:
            java.lang.String r6 = "cgi"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L42
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r6 = r4.a     // Catch: java.lang.Throwable -> L40
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L42
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r6 = r4.a     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L40
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L40
            if (r6 <= 0) goto L42
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r6 = r4.a     // Catch: java.lang.Throwable -> L40
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L40
            r1 = 0
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L40
            com.autonavi.aps.amapapi.storage.a$a r6 = (com.autonavi.aps.amapapi.storage.a.C0093a) r6     // Catch: java.lang.Throwable -> L40
            goto L48
        L40:
            r5 = move-exception
            goto L96
        L42:
            r6 = r0
            goto L48
        L44:
            com.autonavi.aps.amapapi.storage.a$a r6 = r4.a(r6, r5)     // Catch: java.lang.Throwable -> L40
        L48:
            if (r6 == 0) goto L9d
            com.autonavi.aps.amapapi.model.a r1 = r6.a()     // Catch: java.lang.Throwable -> L40
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L9d
            com.autonavi.aps.amapapi.model.a r1 = r6.a()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "mem"
            r1.e(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r6.b()     // Catch: java.lang.Throwable -> L40
            r1.h(r2)     // Catch: java.lang.Throwable -> L40
            if (r7 != 0) goto L87
            long r2 = r1.getTime()     // Catch: java.lang.Throwable -> L40
            boolean r7 = com.autonavi.aps.amapapi.utils.a.a(r2)     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L71
            goto L87
        L71:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r7 = r4.a     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L9d
            boolean r7 = r7.containsKey(r5)     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L9d
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r7 = r4.a     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r7.get(r5)     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L40
            r5.remove(r6)     // Catch: java.lang.Throwable -> L40
            goto L9d
        L87:
            boolean r5 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L91
            r5 = 0
            r4.f5785c = r5     // Catch: java.lang.Throwable -> L40
        L91:
            r5 = 4
            r1.setLocationType(r5)     // Catch: java.lang.Throwable -> L40
            return r1
        L96:
            java.lang.String r6 = "Cache"
            java.lang.String r7 = "get1"
            com.autonavi.aps.amapapi.utils.b.a(r5, r6, r7)
        L9d:
            return r0
    }

    private com.autonavi.aps.amapapi.storage.a.C0093a a(java.lang.StringBuilder r26, java.lang.String r27) {
            r25 = this;
            r0 = r25
            r1 = r27
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r2 = r0.a
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 != 0) goto L13
            boolean r2 = android.text.TextUtils.isEmpty(r26)
            if (r2 == 0) goto L17
        L13:
            r18 = r3
            goto L152
        L17:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r2 = r0.a
            boolean r2 = r2.containsKey(r1)
            if (r2 != 0) goto L20
            return r3
        L20:
            java.util.Hashtable r2 = new java.util.Hashtable
            r2.<init>()
            java.util.Hashtable r4 = new java.util.Hashtable
            r4.<init>()
            java.util.Hashtable r5 = new java.util.Hashtable
            r5.<init>()
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r6 = r0.a
            java.lang.Object r1 = r6.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r6 = r1.size()
            r7 = 1
            int r6 = r6 - r7
        L3d:
            if (r6 < 0) goto L146
            java.lang.Object r8 = r1.get(r6)
            com.autonavi.aps.amapapi.storage.a$a r8 = (com.autonavi.aps.amapapi.storage.a.C0093a) r8
            java.lang.String r9 = r8.b()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L13b
            java.lang.String r9 = r8.b()
            r10 = r26
            boolean r9 = a(r9, r10)
            r11 = 0
            if (r9 == 0) goto L70
            java.lang.String r9 = r8.b()
            java.lang.String r12 = r10.toString()
            boolean r9 = com.autonavi.aps.amapapi.utils.j.a(r9, r12)
            if (r9 == 0) goto L6e
        L6a:
            r16 = r8
            goto L138
        L6e:
            r9 = 1
            goto L71
        L70:
            r9 = 0
        L71:
            java.lang.String r12 = r8.b()
            a(r12, r2)
            java.lang.String r12 = r10.toString()
            a(r12, r4)
            r5.clear()
            java.util.Set r12 = r2.keySet()
            java.util.Iterator r12 = r12.iterator()
        L8a:
            boolean r13 = r12.hasNext()
            java.lang.String r14 = ""
            if (r13 == 0) goto L9c
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r5.put(r13, r14)
            goto L8a
        L9c:
            java.util.Set r12 = r4.keySet()
            java.util.Iterator r12 = r12.iterator()
        La4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lb4
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r5.put(r13, r14)
            goto La4
        Lb4:
            java.util.Set r12 = r5.keySet()
            int r13 = r12.size()
            double[] r13 = new double[r13]
            int r14 = r12.size()
            double[] r14 = new double[r14]
            java.util.Iterator r15 = r12.iterator()
            r16 = 0
        Lca:
            if (r15 == 0) goto Lfc
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto Lfc
            java.lang.Object r17 = r15.next()
            r18 = r3
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            boolean r17 = r2.containsKey(r3)
            r19 = 0
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r17 == 0) goto Le9
            r23 = r21
            goto Leb
        Le9:
            r23 = r19
        Leb:
            r13[r16] = r23
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto Lf5
            r19 = r21
        Lf5:
            r14[r16] = r19
            int r16 = r16 + 1
            r3 = r18
            goto Lca
        Lfc:
            r18 = r3
            r12.clear()
            double[] r3 = a(r13, r14)
            r12 = r3[r11]
            r14 = 4605380979056443392(0x3fe99999a0000000, double:0.800000011920929)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L112
            goto L6a
        L112:
            r12 = r3[r7]
            double r14 = com.autonavi.aps.amapapi.utils.a.g()
            r16 = r8
            r7 = 4603741668684706349(0x3fe3c6a7ef9db22d, double:0.618)
            double r14 = java.lang.Math.min(r14, r7)
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 < 0) goto L128
            goto L138
        L128:
            if (r9 == 0) goto L13f
            r11 = r3[r11]
            double r13 = com.autonavi.aps.amapapi.utils.a.g()
            double r7 = java.lang.Math.min(r13, r7)
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 < 0) goto L13f
        L138:
            r3 = r16
            goto L148
        L13b:
            r10 = r26
            r18 = r3
        L13f:
            int r6 = r6 + (-1)
            r3 = r18
            r7 = 1
            goto L3d
        L146:
            r18 = r3
        L148:
            r2.clear()
            r4.clear()
            r5.clear()
            return r3
        L152:
            return r18
    }

    private java.lang.String a(java.lang.String r9, java.lang.StringBuilder r10, android.content.Context r11) {
            r8 = this;
            java.lang.String r0 = ",access"
            java.lang.String r1 = "&"
            java.lang.String r2 = "cgi"
            java.lang.String r3 = "#"
            r4 = 0
            if (r11 != 0) goto Lc
            return r4
        Lc:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r11 = com.autonavi.aps.amapapi.utils.j.l(r11)     // Catch: java.lang.Throwable -> L9c
            r8.l = r11     // Catch: java.lang.Throwable -> L9c
            boolean r11 = r9.contains(r1)     // Catch: java.lang.Throwable -> L9c
            r6 = 0
            if (r11 == 0) goto L26
            int r11 = r9.indexOf(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r9 = r9.substring(r6, r11)     // Catch: java.lang.Throwable -> L9c
        L26:
            int r11 = r9.lastIndexOf(r3)     // Catch: java.lang.Throwable -> L9c
            int r11 = r11 + 1
            java.lang.String r11 = r9.substring(r11)     // Catch: java.lang.Throwable -> L9c
            boolean r1 = r11.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L44
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L9c
            int r10 = r10 + (-12)
            java.lang.String r9 = r9.substring(r6, r10)     // Catch: java.lang.Throwable -> L9c
            r5.put(r2, r9)     // Catch: java.lang.Throwable -> L9c
            goto L87
        L44:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L87
            int r1 = r10.indexOf(r0)     // Catch: java.lang.Throwable -> L9c
            r7 = -1
            if (r1 == r7) goto L87
            int r11 = r11.length()     // Catch: java.lang.Throwable -> L9c
            int r11 = r11 + 9
            int r1 = r9.length()     // Catch: java.lang.Throwable -> L9c
            int r1 = r1 - r11
            java.lang.String r9 = r9.substring(r6, r1)     // Catch: java.lang.Throwable -> L9c
            r5.put(r2, r9)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L9c
            java.lang.String[] r9 = r9.split(r0)     // Catch: java.lang.Throwable -> L9c
            r10 = r9[r6]     // Catch: java.lang.Throwable -> L9c
            boolean r10 = r10.contains(r3)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L80
            r9 = r9[r6]     // Catch: java.lang.Throwable -> L9c
            int r10 = r9.lastIndexOf(r3)     // Catch: java.lang.Throwable -> L9c
            int r10 = r10 + 1
            java.lang.String r9 = r9.substring(r10)     // Catch: java.lang.Throwable -> L9c
            goto L82
        L80:
            r9 = r9[r6]     // Catch: java.lang.Throwable -> L9c
        L82:
            java.lang.String r10 = "mmac"
            r5.put(r10, r9)     // Catch: java.lang.Throwable -> L9c
        L87:
            java.lang.String r9 = r5.toString()
            java.lang.String r10 = "UTF-8"
            byte[] r9 = r9.getBytes(r10)
            java.lang.String r10 = r8.l
            byte[] r9 = com.autonavi.aps.amapapi.security.a.a(r9, r10)
            java.lang.String r9 = com.amap.api.col.p0003l.j4.f(r9)     // Catch: java.lang.Throwable -> L9c
            return r9
        L9c:
            return r4
    }

    private void a(android.content.Context r20, java.lang.String r21, boolean r22) throws java.lang.Exception {
            r19 = this;
            r1 = r19
            r5 = r20
            r0 = r21
            java.lang.String r2 = "hist"
            java.lang.String r7 = "UTF-8"
            boolean r3 = com.autonavi.aps.amapapi.utils.a.e()
            if (r3 != 0) goto L12
            goto L2aa
        L12:
            if (r5 != 0) goto L16
            goto L2aa
        L16:
            r3 = 0
            java.lang.String r4 = "hmdb"
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r5.openOrCreateDatabase(r4, r8, r3)     // Catch: java.lang.Throwable -> L291
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r9, r2)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L36
            if (r9 == 0) goto L35
            boolean r0 = r9.isOpen()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L35
            r9.close()     // Catch: java.lang.Throwable -> L30
            goto L35
        L30:
            r0 = move-exception
            r10 = r3
        L32:
            r3 = r9
            goto L293
        L35:
            return
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r4.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "'"
            java.lang.String r10 = " and feature = '"
            java.lang.String r11 = "time >"
            if (r22 != 0) goto L6a
            long r12 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L30
            long r14 = com.autonavi.aps.amapapi.utils.a.d()     // Catch: java.lang.Throwable -> L30
            long r12 = r12 - r14
            r4.append(r11)     // Catch: java.lang.Throwable -> L30
            r4.append(r12)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L8f
            r4.append(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            r10.append(r0)     // Catch: java.lang.Throwable -> L30
            r10.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L30
            r4.append(r0)     // Catch: java.lang.Throwable -> L30
            goto L8f
        L6a:
            long r12 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L30
            r14 = 172800000(0xa4cb800, double:8.53745436E-316)
            long r12 = r12 - r14
            r4.append(r11)     // Catch: java.lang.Throwable -> L30
            r4.append(r12)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L8f
            r4.append(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            r10.append(r0)     // Catch: java.lang.Throwable -> L30
            r10.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L30
            r4.append(r0)     // Catch: java.lang.Throwable -> L30
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r1.f5793k     // Catch: java.lang.Throwable -> L30
            r0.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "feature"
            java.lang.String r2 = " nb"
            java.lang.String r6 = "loc"
            java.lang.String[] r11 = new java.lang.String[]{r0, r2, r6}     // Catch: java.lang.Throwable -> L30
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.String r16 = "time ASC"
            r17 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            android.database.Cursor r10 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r3.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r1.l     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto Lc9
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.j.l(r5)     // Catch: java.lang.Throwable -> Lc6
            r1.l = r0     // Catch: java.lang.Throwable -> Lc6
            goto Lc9
        Lc6:
            r0 = move-exception
            goto L32
        Lc9:
            if (r10 == 0) goto L282
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L282
        Ld1:
            java.lang.String r0 = r10.getString(r8)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = "{"
            boolean r0 = r0.startsWith(r2)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = "new"
            java.lang.String r11 = ",access"
            java.lang.String r12 = "type"
            r13 = 1
            java.lang.String r14 = "mmac"
            java.lang.String r15 = "#"
            if (r0 == 0) goto L133
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r10.getString(r8)     // Catch: java.lang.Throwable -> Lc6
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lc6
            int r6 = r3.length()     // Catch: java.lang.Throwable -> Lc6
            r3.delete(r8, r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r10.getString(r13)     // Catch: java.lang.Throwable -> Lc6
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lc6
            if (r6 != 0) goto L10a
            java.lang.String r6 = r10.getString(r13)     // Catch: java.lang.Throwable -> Lc6
            r3.append(r6)     // Catch: java.lang.Throwable -> Lc6
            goto L11d
        L10a:
            boolean r6 = com.autonavi.aps.amapapi.utils.j.a(r0, r14)     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto L11d
            r3.append(r15)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r0.getString(r14)     // Catch: java.lang.Throwable -> Lc6
            r3.append(r6)     // Catch: java.lang.Throwable -> Lc6
            r3.append(r11)     // Catch: java.lang.Throwable -> Lc6
        L11d:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc6
            r11 = 2
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r11)     // Catch: java.lang.Throwable -> Lc6
            boolean r11 = com.autonavi.aps.amapapi.utils.j.a(r6, r12)     // Catch: java.lang.Throwable -> Lc6
            if (r11 == 0) goto L130
            r6.put(r12, r2)     // Catch: java.lang.Throwable -> Lc6
        L130:
            r2 = r4
            goto L1ae
        L133:
            java.lang.String r0 = r10.getString(r8)     // Catch: java.lang.Throwable -> Lc6
            byte[] r0 = com.amap.api.col.p0003l.j4.g(r0)     // Catch: java.lang.Throwable -> Lc6
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = r1.l     // Catch: java.lang.Throwable -> Lc6
            byte[] r0 = com.autonavi.aps.amapapi.security.a.b(r0, r8)     // Catch: java.lang.Throwable -> Lc6
            r13.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r13)     // Catch: java.lang.Throwable -> Lc6
            int r0 = r3.length()     // Catch: java.lang.Throwable -> Lc6
            r8 = 0
            r3.delete(r8, r0)     // Catch: java.lang.Throwable -> Lc6
            r0 = 1
            java.lang.String r8 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lc6
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lc6
            if (r8 != 0) goto L176
            java.lang.String r0 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lc6
            byte[] r0 = com.amap.api.col.p0003l.j4.g(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r11 = r1.l     // Catch: java.lang.Throwable -> Lc6
            byte[] r0 = com.autonavi.aps.amapapi.security.a.b(r0, r11)     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lc6
            r3.append(r8)     // Catch: java.lang.Throwable -> Lc6
        L174:
            r11 = 2
            goto L18a
        L176:
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r6, r14)     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L174
            r3.append(r15)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r6.getString(r14)     // Catch: java.lang.Throwable -> Lc6
            r3.append(r0)     // Catch: java.lang.Throwable -> Lc6
            r3.append(r11)     // Catch: java.lang.Throwable -> Lc6
            goto L174
        L18a:
            java.lang.String r0 = r10.getString(r11)     // Catch: java.lang.Throwable -> Lc6
            byte[] r0 = com.amap.api.col.p0003l.j4.g(r0)     // Catch: java.lang.Throwable -> Lc6
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r13 = r1.l     // Catch: java.lang.Throwable -> Lc6
            byte[] r0 = com.autonavi.aps.amapapi.security.a.b(r0, r13)     // Catch: java.lang.Throwable -> Lc6
            r11.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r11)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r8, r12)     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L1ab
            r8.put(r12, r2)     // Catch: java.lang.Throwable -> Lc6
        L1ab:
            r0 = r6
            r6 = r8
            goto L130
        L1ae:
            com.autonavi.aps.amapapi.model.a r4 = new com.autonavi.aps.amapapi.model.a     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = ""
            r4.<init>(r8)     // Catch: java.lang.Throwable -> Lc6
            r4.b(r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r6 = com.autonavi.aps.amapapi.utils.j.a(r0, r14)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = "network#"
            java.lang.String r11 = "cgi"
            if (r6 == 0) goto L218
            boolean r6 = com.autonavi.aps.amapapi.utils.j.a(r0, r11)     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto L218
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r6.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r12 = r0.getString(r11)     // Catch: java.lang.Throwable -> Lc6
            r6.append(r12)     // Catch: java.lang.Throwable -> Lc6
            r6.append(r15)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r12.<init>()     // Catch: java.lang.Throwable -> Lc6
            r12.append(r6)     // Catch: java.lang.Throwable -> Lc6
            r12.append(r8)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.getString(r11)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.contains(r15)     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L206
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r0.<init>()     // Catch: java.lang.Throwable -> Lc6
            r0.append(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "cgiwifi"
            r0.append(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc6
            goto L259
        L206:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r0.<init>()     // Catch: java.lang.Throwable -> Lc6
            r0.append(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "wifi"
            r0.append(r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc6
            goto L259
        L218:
            boolean r6 = com.autonavi.aps.amapapi.utils.j.a(r0, r11)     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto L263
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r6.<init>()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r12 = r0.getString(r11)     // Catch: java.lang.Throwable -> Lc6
            r6.append(r12)     // Catch: java.lang.Throwable -> Lc6
            r6.append(r15)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r12.<init>()     // Catch: java.lang.Throwable -> Lc6
            r12.append(r6)     // Catch: java.lang.Throwable -> Lc6
            r12.append(r8)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.getString(r11)     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.contains(r15)     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L263
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r0.<init>()     // Catch: java.lang.Throwable -> Lc6
            r0.append(r6)     // Catch: java.lang.Throwable -> Lc6
            r0.append(r11)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc6
        L259:
            r6 = 0
            r18 = r2
            r2 = r0
            r0 = r18
            r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc6
            goto L264
        L263:
            r0 = r2
        L264:
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L27a
            int r1 = r3.length()     // Catch: java.lang.Throwable -> Lc6
            r8 = 0
            r3.delete(r8, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lc6
            r0.delete(r8, r1)     // Catch: java.lang.Throwable -> Lc6
            goto L282
        L27a:
            r1 = r19
            r5 = r20
            r4 = r0
            r8 = 0
            goto Ld1
        L282:
            if (r10 == 0) goto L287
            r10.close()
        L287:
            boolean r0 = r9.isOpen()
            if (r0 == 0) goto L2aa
            r9.close()
            return
        L291:
            r0 = move-exception
            r10 = r3
        L293:
            java.lang.String r1 = "DB"
            java.lang.String r2 = "fetchHist p2"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L2ab
            if (r10 == 0) goto L29f
            r10.close()
        L29f:
            if (r3 == 0) goto L2aa
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L2aa
            r3.close()
        L2aa:
            return
        L2ab:
            r0 = move-exception
            if (r10 == 0) goto L2b1
            r10.close()
        L2b1:
            if (r3 == 0) goto L2bc
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L2bc
            r3.close()
        L2bc:
            throw r0
    }

    private void a(java.lang.String r6, com.amap.api.location.AMapLocation r7, java.lang.StringBuilder r8, android.content.Context r9) throws java.lang.Exception {
            r5 = this;
            java.lang.String r0 = "UTF-8"
            if (r9 != 0) goto L6
            goto Lcd
        L6:
            java.lang.String r1 = r5.l
            if (r1 != 0) goto L10
            java.lang.String r1 = com.autonavi.aps.amapapi.utils.j.l(r9)
            r5.l = r1
        L10:
            java.lang.String r6 = r5.a(r6, r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 0
            java.lang.String r4 = "hmdb"
            android.database.sqlite.SQLiteDatabase r2 = r9.openOrCreateDatabase(r4, r3, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "CREATE TABLE IF NOT EXISTS hist"
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r5.f5793k     // Catch: java.lang.Throwable -> L93
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = " (feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR);"
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L93
            r2.execSQL(r9)     // Catch: java.lang.Throwable -> L93
            int r9 = r1.length()     // Catch: java.lang.Throwable -> L93
            r1.delete(r3, r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "REPLACE INTO "
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "hist"
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r5.f5793k     // Catch: java.lang.Throwable -> L93
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = " VALUES (?, ?, ?, ?)"
            r1.append(r9)     // Catch: java.lang.Throwable -> L93
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L93
            r9[r3] = r6     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L93
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = r5.l     // Catch: java.lang.Throwable -> L93
            byte[] r6 = com.autonavi.aps.amapapi.security.a.a(r6, r8)     // Catch: java.lang.Throwable -> L93
            r8 = 1
            r9[r8] = r6     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r7.toStr()     // Catch: java.lang.Throwable -> L93
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r5.l     // Catch: java.lang.Throwable -> L93
            byte[] r6 = com.autonavi.aps.amapapi.security.a.a(r6, r0)     // Catch: java.lang.Throwable -> L93
            r0 = 2
            r9[r0] = r6     // Catch: java.lang.Throwable -> L93
            long r6 = r7.getTime()     // Catch: java.lang.Throwable -> L93
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L93
            r7 = 3
            r9[r7] = r6     // Catch: java.lang.Throwable -> L93
        L84:
            if (r8 >= r7) goto L95
            r6 = r9[r8]     // Catch: java.lang.Throwable -> L93
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = com.amap.api.col.p0003l.j4.f(r6)     // Catch: java.lang.Throwable -> L93
            r9[r8] = r6     // Catch: java.lang.Throwable -> L93
            int r8 = r8 + 1
            goto L84
        L93:
            r6 = move-exception
            goto Lb4
        L95:
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L93
            r2.execSQL(r6, r9)     // Catch: java.lang.Throwable -> L93
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L93
            r1.delete(r3, r6)     // Catch: java.lang.Throwable -> L93
            int r6 = r1.length()
            r1.delete(r3, r6)
            boolean r6 = r2.isOpen()
            if (r6 == 0) goto Lcd
            r2.close()
            return
        Lb4:
            java.lang.String r7 = "DB"
            java.lang.String r8 = "updateHist"
            com.autonavi.aps.amapapi.utils.b.a(r6, r7, r8)     // Catch: java.lang.Throwable -> Lce
            int r6 = r1.length()
            r1.delete(r3, r6)
            if (r2 == 0) goto Lcd
            boolean r6 = r2.isOpen()
            if (r6 == 0) goto Lcd
            r2.close()
        Lcd:
            return
        Lce:
            r6 = move-exception
            int r7 = r1.length()
            r1.delete(r3, r7)
            if (r2 == 0) goto Le1
            boolean r7 = r2.isOpen()
            if (r7 == 0) goto Le1
            r2.close()
        Le1:
            throw r6
    }

    private static void a(java.lang.String r4, java.util.Hashtable<java.lang.String, java.lang.String> r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L2c
        L7:
            r5.clear()
            java.lang.String r0 = "#"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r1 = 0
        L12:
            if (r1 >= r0) goto L2c
            r2 = r4[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L29
            java.lang.String r3 = "|"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L29
            java.lang.String r3 = ""
            r5.put(r2, r3)
        L29:
            int r1 = r1 + 1
            goto L12
        L2c:
            return
    }

    private boolean a(com.autonavi.aps.amapapi.model.a r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.a(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r5 == 0) goto L17
            long r2 = r5.getTime()
            boolean r5 = com.autonavi.aps.amapapi.utils.a.a(r2)
            if (r5 != 0) goto L17
            if (r6 != 0) goto L17
            return r1
        L17:
            r5 = 1
            return r5
    }

    private static boolean a(java.lang.String r2, com.autonavi.aps.amapapi.model.a r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L1e
            boolean r3 = com.autonavi.aps.amapapi.utils.j.a(r3)
            if (r3 != 0) goto Le
            goto L1e
        Le:
            java.lang.String r3 = "#"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L17
            return r1
        L17:
            java.lang.String r3 = "network"
            boolean r2 = r2.contains(r3)
            return r2
        L1e:
            return r1
    }

    private static boolean a(java.lang.String r4, java.lang.StringBuilder r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L5a
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L5a
        Le:
            java.lang.String r0 = ",access"
            boolean r2 = r4.contains(r0)
            if (r2 == 0) goto L5a
            int r2 = r5.indexOf(r0)
            r3 = -1
            if (r2 != r3) goto L1e
            goto L5a
        L1e:
            java.lang.String[] r4 = r4.split(r0)
            r2 = r4[r1]
            java.lang.String r3 = "#"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L39
            r4 = r4[r1]
            int r2 = r4.lastIndexOf(r3)
            int r2 = r2 + 1
            java.lang.String r4 = r4.substring(r2)
            goto L3b
        L39:
            r4 = r4[r1]
        L3b:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L42
            return r1
        L42:
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            boolean r4 = r5.contains(r4)
            return r4
        L5a:
            return r1
    }

    private boolean a(boolean r3) {
            r2 = this;
            boolean r0 = com.autonavi.aps.amapapi.utils.a.e()
            r1 = 0
            if (r0 != 0) goto La
            if (r3 != 0) goto La
            return r1
        La:
            boolean r0 = r2.f5784b
            if (r0 != 0) goto L18
            boolean r0 = com.autonavi.aps.amapapi.utils.a.f()
            if (r0 != 0) goto L18
            if (r3 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            r3 = 1
            return r3
    }

    private static double[] a(double[] r21, double[] r22) {
            r0 = r21
            r1 = 3
            double[] r1 = new double[r1]
            r2 = 0
            r4 = 0
            r5 = r2
            r7 = r5
            r9 = 0
            r10 = 0
            r11 = 0
        Ld:
            int r12 = r0.length
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r9 >= r12) goto L31
            r15 = r0[r9]
            double r17 = r15 * r15
            double r5 = r5 + r17
            r17 = r22[r9]
            double r19 = r17 * r17
            double r7 = r7 + r19
            double r19 = r15 * r17
            double r2 = r2 + r19
            int r12 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r12 != 0) goto L2e
            int r11 = r11 + 1
            int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r12 != 0) goto L2e
            int r10 = r10 + 1
        L2e:
            int r9 = r9 + 1
            goto Ld
        L31:
            double r5 = java.lang.Math.sqrt(r5)
            double r7 = java.lang.Math.sqrt(r7)
            double r5 = r5 * r7
            double r2 = r2 / r5
            r1[r4] = r2
            double r2 = (double) r10
            double r5 = r2 * r13
            double r7 = (double) r11
            double r5 = r5 / r7
            r0 = 1
            r1[r0] = r5
            r0 = 2
            r1[r0] = r2
        L49:
            if (r4 >= r0) goto L56
            r2 = r1[r4]
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 <= 0) goto L53
            r1[r4] = r13
        L53:
            int r4 = r4 + 1
            goto L49
        L56:
            return r1
    }

    private boolean b() {
            r8 = this;
            long r0 = com.autonavi.aps.amapapi.utils.j.b()
            long r2 = r8.f5791i
            long r0 = r0 - r2
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto Lf
            return r6
        Lf:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r2 = r8.a
            int r2 = r2.size()
            r3 = 360(0x168, float:5.04E-43)
            if (r2 > r3) goto L22
            r2 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            goto L22
        L21:
            return r6
        L22:
            r0 = 1
            return r0
    }

    private void c() {
            r2 = this;
            r0 = 0
            r2.f5791i = r0
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r0 = r2.a
            r0.clear()
        L11:
            r0 = 0
            r2.f5792j = r0
            return
    }

    private void c(android.content.Context r8) throws java.lang.Exception {
            r7 = this;
            java.lang.String r0 = "DB"
            java.lang.String r1 = "hist"
            if (r8 != 0) goto L8
            goto L78
        L8:
            r2 = 0
            java.lang.String r3 = "hmdb"
            r4 = 0
            android.database.sqlite.SQLiteDatabase r2 = r8.openOrCreateDatabase(r3, r4, r2)     // Catch: java.lang.Throwable -> L22
            boolean r8 = com.autonavi.aps.amapapi.utils.j.a(r2, r1)     // Catch: java.lang.Throwable -> L22
            if (r8 != 0) goto L25
            if (r2 == 0) goto L24
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L24
            r2.close()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r8 = move-exception
            goto L6a
        L24:
            return
        L25:
            java.lang.String r8 = "time<?"
            long r3 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L22
            r5 = 172800000(0xa4cb800, double:8.53745436E-316)
            long r3 = r3 - r5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r7.f5793k     // Catch: java.lang.Throwable -> L49
            r4.append(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L49
            r2.delete(r1, r8, r3)     // Catch: java.lang.Throwable -> L49
            goto L5e
        L49:
            r8 = move-exception
            java.lang.String r1 = "clearHist"
            com.autonavi.aps.amapapi.utils.b.a(r8, r0, r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L22
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L5e
            java.lang.String r1 = "no such table"
            r8.contains(r1)     // Catch: java.lang.Throwable -> L22
        L5e:
            if (r2 == 0) goto L78
            boolean r8 = r2.isOpen()
            if (r8 == 0) goto L78
        L66:
            r2.close()
            goto L78
        L6a:
            java.lang.String r1 = "clearHist p2"
            com.autonavi.aps.amapapi.utils.b.a(r8, r0, r1)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L78
            boolean r8 = r2.isOpen()
            if (r8 == 0) goto L78
            goto L66
        L78:
            return
        L79:
            r8 = move-exception
            if (r2 == 0) goto L85
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L85
            r2.close()
        L85:
            throw r8
    }

    public final com.autonavi.aps.amapapi.model.a a(android.content.Context r4, java.lang.String r5, java.lang.StringBuilder r6, boolean r7, boolean r8) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = com.autonavi.aps.amapapi.utils.a.e()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "&"
            r0.append(r5)
            boolean r2 = r3.f5788f
            r0.append(r2)
            r0.append(r5)
            boolean r2 = r3.f5789g
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r3.f5790h
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "gps"
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L70
            boolean r0 = com.autonavi.aps.amapapi.utils.a.e()
            if (r0 == 0) goto L70
            if (r6 != 0) goto L46
            goto L70
        L46:
            boolean r0 = r3.b()
            if (r0 == 0) goto L50
            r3.c()
            return r1
        L50:
            if (r7 == 0) goto L62
            boolean r7 = r3.f5792j
            if (r7 != 0) goto L62
            java.lang.String r7 = r3.a(r5, r6, r4)     // Catch: java.lang.Throwable -> L61
            r3.c()     // Catch: java.lang.Throwable -> L61
            r3.a(r4, r7, r8)     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
        L62:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r4 = r3.a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L6b
            return r1
        L6b:
            com.autonavi.aps.amapapi.model.a r4 = r3.a(r5, r6, r8)
            return r4
        L70:
            return r1
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.restruct.e r17, boolean r18, com.autonavi.aps.amapapi.model.a r19, com.autonavi.aps.amapapi.restruct.k r20, java.lang.StringBuilder r21, java.lang.String r22, android.content.Context r23, boolean r24) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r22
            r3 = r24
            boolean r3 = r0.a(r1, r3)
            r6 = 0
            if (r3 != 0) goto L10
            return r6
        L10:
            com.autonavi.aps.amapapi.restruct.d r3 = r17.e()     // Catch: java.lang.Throwable -> Lf0
            r7 = 1
            r8 = 0
            if (r3 != 0) goto L1c
            com.autonavi.aps.amapapi.restruct.d r4 = r0.f5787e     // Catch: java.lang.Throwable -> Lf0
            if (r4 == 0) goto L27
        L1c:
            com.autonavi.aps.amapapi.restruct.d r4 = r0.f5787e     // Catch: java.lang.Throwable -> Lf0
            if (r4 == 0) goto L29
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> Lf0
            if (r3 != 0) goto L27
            goto L29
        L27:
            r3 = 0
            goto L2a
        L29:
            r3 = 1
        L2a:
            if (r1 == 0) goto L47
            java.util.ArrayList r4 = r20.e()     // Catch: java.lang.Throwable -> Lf0
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lf0
            float r5 = r1.getAccuracy()     // Catch: java.lang.Throwable -> Lf0
            r9 = 1133871104(0x43958000, float:299.0)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L44
            r5 = 5
            if (r4 <= r5) goto L44
            r4 = 1
            goto L45
        L44:
            r4 = 0
        L45:
            r9 = r4
            goto L48
        L47:
            r9 = 0
        L48:
            r4 = 3000(0xbb8, double:1.482E-320)
            r10 = 0
            if (r1 == 0) goto L86
            java.lang.String r12 = r0.f5786d     // Catch: java.lang.Throwable -> Lf0
            if (r12 == 0) goto L86
            if (r9 != 0) goto L86
            if (r3 != 0) goto L86
            java.lang.String r3 = r21.toString()     // Catch: java.lang.Throwable -> Lf0
            boolean r3 = com.autonavi.aps.amapapi.utils.j.a(r12, r3)     // Catch: java.lang.Throwable -> Lf0
            long r12 = r0.f5785c     // Catch: java.lang.Throwable -> Lf0
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 == 0) goto L71
            long r12 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> Lf0
            long r14 = r0.f5785c     // Catch: java.lang.Throwable -> Lf0
            long r12 = r12 - r14
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 >= 0) goto L71
            r12 = 1
            goto L72
        L71:
            r12 = 0
        L72:
            if (r3 != 0) goto L76
            if (r12 == 0) goto L87
        L76:
            boolean r12 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> Lf0
            if (r12 == 0) goto L87
            java.lang.String r2 = "mem"
            r1.e(r2)     // Catch: java.lang.Throwable -> Lf0
            r2 = 2
            r1.setLocationType(r2)     // Catch: java.lang.Throwable -> Lf0
            return r1
        L86:
            r3 = 0
        L87:
            if (r3 != 0) goto L90
            long r12 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> Lf0
            r0.f5785c = r12     // Catch: java.lang.Throwable -> Lf0
            goto L92
        L90:
            r0.f5785c = r10     // Catch: java.lang.Throwable -> Lf0
        L92:
            java.lang.String r1 = r0.m     // Catch: java.lang.Throwable -> Lf0
            if (r1 == 0) goto Lb4
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lf0
            if (r1 != 0) goto Lb4
            long r12 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> Lf0
            long r14 = r0.n     // Catch: java.lang.Throwable -> Lf0
            long r12 = r12 - r14
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lab
            java.lang.String r1 = r0.m     // Catch: java.lang.Throwable -> Lf0
            r2 = r1
            goto Lc7
        Lab:
            long r3 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> Lf0
            r0.n = r3     // Catch: java.lang.Throwable -> Lf0
            r0.m = r2     // Catch: java.lang.Throwable -> Lf0
            goto Lc7
        Lb4:
            java.lang.String r1 = r0.m     // Catch: java.lang.Throwable -> Lf0
            if (r1 != 0) goto Lc1
            long r3 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> Lf0
            r0.n = r3     // Catch: java.lang.Throwable -> Lf0
            r0.m = r2     // Catch: java.lang.Throwable -> Lf0
            goto Lc7
        Lc1:
            long r3 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> Lf0
            r0.n = r3     // Catch: java.lang.Throwable -> Lf0
        Lc7:
            if (r9 != 0) goto Ld6
            if (r18 != 0) goto Ld6
            r4 = 0
            r5 = 0
            r3 = r21
            r1 = r23
            com.autonavi.aps.amapapi.model.a r1 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf0
            goto Ld7
        Ld6:
            r1 = r6
        Ld7:
            if (r18 != 0) goto Le0
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r1)     // Catch: java.lang.Throwable -> Lf0
            if (r2 != 0) goto Le0
            goto Le1
        Le0:
            r7 = 0
        Le1:
            if (r7 != 0) goto Lf0
            if (r9 == 0) goto Le6
            goto Lf0
        Le6:
            if (r18 == 0) goto Le9
            return r6
        Le9:
            r0.f5785c = r10     // Catch: java.lang.Throwable -> Lf0
            r2 = 4
            r1.setLocationType(r2)     // Catch: java.lang.Throwable -> Lf0
            return r1
        Lf0:
            return r6
    }

    public final void a() {
            r2 = this;
            r0 = 0
            r2.f5785c = r0
            r0 = 0
            r2.f5786d = r0
            return
    }

    public final void a(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.f5792j
            if (r0 == 0) goto L5
            return
        L5:
            r2.c()     // Catch: java.lang.Throwable -> Le
            r0 = 0
            r1 = 0
            r2.a(r3, r0, r1)     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r3 = move-exception
            java.lang.String r0 = "Cache"
            java.lang.String r1 = "loadDB"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
        L16:
            r3 = 1
            r2.f5792j = r3
            return
    }

    public final void a(com.amap.api.location.AMapLocationClientOption r2) {
            r1 = this;
            boolean r0 = r2.isNeedAddress()
            r1.f5789g = r0
            boolean r0 = r2.isOffset()
            r1.f5788f = r0
            boolean r0 = r2.isLocationCacheEnable()
            r1.f5784b = r0
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r2.getGeoLanguage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.f5790h = r2
            return
    }

    public final void a(com.autonavi.aps.amapapi.restruct.d r1) {
            r0 = this;
            r0.f5787e = r1
            return
    }

    public final void a(java.lang.String r1) {
            r0 = this;
            r0.f5786d = r1
            return
    }

    public final void a(java.lang.String r15, java.lang.StringBuilder r16, com.autonavi.aps.amapapi.model.a r17, android.content.Context r18, boolean r19) {
            r14 = this;
            r0 = r16
            r7 = r17
            java.lang.String r8 = "add"
            java.lang.String r9 = "Cache"
            java.lang.String r1 = "cgiwifi"
            java.lang.String r2 = "offpct"
            java.lang.String r3 = "&"
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r7)     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L16
            goto L193
        L16:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r4.<init>()     // Catch: java.lang.Throwable -> L86
            r4.append(r15)     // Catch: java.lang.Throwable -> L86
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            boolean r5 = r7.isOffset()     // Catch: java.lang.Throwable -> L86
            r4.append(r5)     // Catch: java.lang.Throwable -> L86
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            boolean r5 = r7.i()     // Catch: java.lang.Throwable -> L86
            r4.append(r5)     // Catch: java.lang.Throwable -> L86
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r7.j()     // Catch: java.lang.Throwable -> L86
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L86
            boolean r3 = a(r10, r7)     // Catch: java.lang.Throwable -> L86
            if (r3 != 0) goto L48
            goto L193
        L48:
            java.lang.String r3 = r7.e()     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "mem"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L86
            if (r3 != 0) goto L193
            java.lang.String r3 = r7.e()     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "file"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L86
            if (r3 != 0) goto L193
            java.lang.String r3 = r7.e()     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "wifioff"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L6e
            goto L193
        L6e:
            java.lang.String r3 = "-3"
            java.lang.String r4 = r7.d()     // Catch: java.lang.Throwable -> L86
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L7c
            goto L193
        L7c:
            boolean r3 = r14.b()     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L89
            r14.c()     // Catch: java.lang.Throwable -> L86
            goto L89
        L86:
            r0 = move-exception
            goto L194
        L89:
            org.json.JSONObject r3 = r7.f()     // Catch: java.lang.Throwable -> L86
            boolean r4 = com.autonavi.aps.amapapi.utils.j.a(r3, r2)     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L99
            r3.remove(r2)     // Catch: java.lang.Throwable -> L86
            r7.a(r3)     // Catch: java.lang.Throwable -> L86
        L99:
            java.lang.String r2 = "wifi"
            boolean r2 = r10.contains(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "cgi"
            java.lang.String r4 = ","
            r11 = 0
            if (r2 == 0) goto L111
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto Lae
            goto L193
        Lae:
            float r2 = r7.getAccuracy()     // Catch: java.lang.Throwable -> L86
            r5 = 1133903872(0x43960000, float:300.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto Lda
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "#"
            java.lang.String[] r2 = r2.split(r5)     // Catch: java.lang.Throwable -> L86
            int r5 = r2.length     // Catch: java.lang.Throwable -> L86
            r6 = 0
            r12 = 0
        Lc5:
            if (r6 >= r5) goto Ld4
            r13 = r2[r6]     // Catch: java.lang.Throwable -> L86
            boolean r13 = r13.contains(r4)     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto Ld1
            int r12 = r12 + 1
        Ld1:
            int r6 = r6 + 1
            goto Lc5
        Ld4:
            r2 = 8
            if (r12 < r2) goto Le6
            goto L193
        Lda:
            float r2 = r7.getAccuracy()     // Catch: java.lang.Throwable -> L86
            r4 = 1077936128(0x40400000, float:3.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto Le6
            goto L193
        Le6:
            boolean r2 = r10.contains(r1)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L12f
            java.lang.String r2 = r7.g()     // Catch: java.lang.Throwable -> L86
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L12f
            java.lang.String r2 = r10.replace(r1, r3)     // Catch: java.lang.Throwable -> L86
            com.autonavi.aps.amapapi.model.a r4 = r7.h()     // Catch: java.lang.Throwable -> L86
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L12f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            r6 = 1
            r1 = r14
            r5 = r18
            r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            goto L12f
        L111:
            boolean r2 = r10.contains(r3)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L12f
            if (r0 == 0) goto L122
            int r2 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L86
            r3 = -1
            if (r2 == r3) goto L122
            goto L193
        L122:
            java.lang.String r2 = "4"
            java.lang.String r3 = r7.d()     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L12f
            goto L193
        L12f:
            com.autonavi.aps.amapapi.model.a r2 = r14.a(r10, r0, r11)     // Catch: java.lang.Throwable -> L86
            boolean r3 = com.autonavi.aps.amapapi.utils.j.a(r2)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L149
            java.lang.String r2 = r2.toStr()     // Catch: java.lang.Throwable -> L86
            r3 = 3
            java.lang.String r3 = r7.toStr(r3)     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L149
            goto L193
        L149:
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L86
            r14.f5791i = r2     // Catch: java.lang.Throwable -> L86
            com.autonavi.aps.amapapi.storage.a$a r2 = new com.autonavi.aps.amapapi.storage.a$a     // Catch: java.lang.Throwable -> L86
            r2.<init>()     // Catch: java.lang.Throwable -> L86
            r2.a(r7)     // Catch: java.lang.Throwable -> L86
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L15f
            r3 = 0
            goto L163
        L15f:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L86
        L163:
            r2.a(r3)     // Catch: java.lang.Throwable -> L86
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r3 = r14.a     // Catch: java.lang.Throwable -> L86
            boolean r3 = r3.containsKey(r10)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L17a
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r3 = r14.a     // Catch: java.lang.Throwable -> L86
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L86
            r3.add(r2)     // Catch: java.lang.Throwable -> L86
            goto L187
        L17a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            r3.add(r2)     // Catch: java.lang.Throwable -> L86
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.autonavi.aps.amapapi.storage.a$a>> r2 = r14.a     // Catch: java.lang.Throwable -> L86
            r2.put(r10, r3)     // Catch: java.lang.Throwable -> L86
        L187:
            if (r19 == 0) goto L193
            r5 = r18
            r14.a(r10, r7, r0, r5)     // Catch: java.lang.Throwable -> L18f
            return
        L18f:
            r0 = move-exception
            com.autonavi.aps.amapapi.utils.b.a(r0, r9, r8)     // Catch: java.lang.Throwable -> L86
        L193:
            return
        L194:
            com.autonavi.aps.amapapi.utils.b.a(r0, r9, r8)
            return
    }

    public final void b(android.content.Context r3) {
            r2 = this;
            r2.c()     // Catch: java.lang.Throwable -> L11
            r2.c(r3)     // Catch: java.lang.Throwable -> L11
            r3 = 0
            r2.f5792j = r3     // Catch: java.lang.Throwable -> L11
            r3 = 0
            r2.f5786d = r3     // Catch: java.lang.Throwable -> L11
            r0 = 0
            r2.n = r0     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            java.lang.String r0 = "Cache"
            java.lang.String r1 = "destroy part"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }
}
