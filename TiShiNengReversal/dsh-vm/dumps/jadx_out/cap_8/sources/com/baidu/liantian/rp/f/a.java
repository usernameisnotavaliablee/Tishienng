package com.baidu.liantian.rp.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    com.baidu.liantian.e a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f6017b;

    /* renamed from: c, reason: collision with root package name */
    com.baidu.liantian.rp.d.a.a f6018c;

    /* renamed from: d, reason: collision with root package name */
    public com.baidu.liantian.rp.e.a f6019d;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.liantian.rp.f.a.HandlerC0096a f6020e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.liantian.rp.f.a$a, reason: collision with other inner class name */
    private class HandlerC0096a extends android.os.Handler {
        final /* synthetic */ com.baidu.liantian.rp.f.a a;

        public HandlerC0096a(com.baidu.liantian.rp.f.a r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r10) {
                r9 = this;
                int r0 = r10.what     // Catch: java.lang.Throwable -> L236
                r1 = 10
                r2 = 2
                r3 = 0
                r4 = 1
                switch(r0) {
                    case 0: goto L230;
                    case 1: goto L213;
                    case 2: goto L1f5;
                    case 3: goto L154;
                    case 4: goto L136;
                    case 5: goto Lde;
                    case 6: goto Ld2;
                    case 7: goto Lc1;
                    case 8: goto Lb1;
                    case 9: goto Lab;
                    case 10: goto L47;
                    case 11: goto Lc;
                    default: goto La;
                }     // Catch: java.lang.Throwable -> L236
            La:
                goto L1f4
            Lc:
                java.lang.Object r10 = r10.obj     // Catch: java.lang.Throwable -> L236
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L236
                r1.<init>(r10)     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r0 = com.baidu.liantian.b.e.a(r0, r1)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r1 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.d.a.a r1 = r1.f6018c     // Catch: java.lang.Throwable -> L236
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L236
                r2.<init>()     // Catch: java.lang.Throwable -> L236
                org.json.JSONArray r0 = r2.put(r0)     // Catch: java.lang.Throwable -> L236
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L236
                r2.<init>(r10)     // Catch: java.lang.Throwable -> L236
                java.lang.String r2 = com.baidu.liantian.rp.f.a.a(r2)     // Catch: java.lang.Throwable -> L236
                boolean r0 = r1.a(r0, r2)     // Catch: java.lang.Throwable -> L236
                if (r0 != 0) goto L1f4
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.e.c(r0, r10)     // Catch: java.lang.Throwable -> L236
                return
            L47:
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r10 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                int r10 = com.baidu.liantian.b.e.o(r10)     // Catch: java.lang.Throwable -> L236
                if (r2 != r10) goto L9f
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r0 = com.baidu.liantian.rp.b.a.a(r0)     // Catch: java.lang.Throwable -> L236
                int r0 = r0.b()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.e r1 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r2 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r2 = r2.f6017b     // Catch: java.lang.Throwable -> L236
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L236
                android.content.SharedPreferences r1 = r1.f5994e     // Catch: java.lang.Throwable -> L236
                java.lang.String r2 = "up_nu_co"
                r5 = 50
                int r1 = r1.getInt(r2, r5)     // Catch: java.lang.Throwable -> L236
                if (r0 < r1) goto L7e
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r0, r3, r10)     // Catch: java.lang.Throwable -> L236
                return
            L7e:
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r0 = com.baidu.liantian.rp.b.a.a(r0)     // Catch: java.lang.Throwable -> L236
                java.util.List r0 = r0.a(r4, r10)     // Catch: java.lang.Throwable -> L236
                r0.size()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L236
                if (r0 <= 0) goto L1f4
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r0, r3, r10)     // Catch: java.lang.Throwable -> L236
                return
            L9f:
                if (r4 != r10) goto L1f4
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                r1 = 4
                com.baidu.liantian.rp.f.a.a(r0, r1, r10)     // Catch: java.lang.Throwable -> L236
                return
            Lab:
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r10, r3, r2)     // Catch: java.lang.Throwable -> L236
                return
            Lb1:
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                int r0 = com.baidu.liantian.b.e.o(r0)     // Catch: java.lang.Throwable -> L236
                r1 = 3
                com.baidu.liantian.rp.f.a.a(r10, r1, r0)     // Catch: java.lang.Throwable -> L236
                return
            Lc1:
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.b(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                int r0 = com.baidu.liantian.b.e.o(r0)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r10, r4, r0)     // Catch: java.lang.Throwable -> L236
                return
            Ld2:
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                int r0 = com.baidu.liantian.b.e.o(r0)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r10, r4, r0)     // Catch: java.lang.Throwable -> L236
                return
            Lde:
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.e r0 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L236
                android.content.Context r2 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L236
                int r2 = r0.x()     // Catch: java.lang.Throwable -> L236
                java.lang.Integer.toString(r2)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L236
                android.content.SharedPreferences r5 = r0.f5994e     // Catch: java.lang.Throwable -> L236
                java.lang.String r6 = "re_last_ofline_time"
                r7 = 0
                long r5 = r5.getLong(r6, r7)     // Catch: java.lang.Throwable -> L236
                long r3 = r3 - r5
                r5 = 3600000(0x36ee80, float:5.044674E-39)
                int r2 = r2 * r5
                long r5 = (long) r2     // Catch: java.lang.Throwable -> L236
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 < 0) goto L125
                android.content.Context r2 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.f r2 = com.baidu.liantian.b.f.a(r2)     // Catch: java.lang.Throwable -> L236
                r2.c()     // Catch: java.lang.Throwable -> L236
                android.content.Context r10 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.e.a(r10, r5)     // Catch: java.lang.Throwable -> L236
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L236
                r0.d(r2)     // Catch: java.lang.Throwable -> L236
                goto L12b
            L125:
                android.content.Context r10 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                long r5 = r5 - r3
                com.baidu.liantian.b.e.a(r10, r5)     // Catch: java.lang.Throwable -> L236
            L12b:
                android.os.Message r10 = new android.os.Message     // Catch: java.lang.Throwable -> L236
                r10.<init>()     // Catch: java.lang.Throwable -> L236
                r10.what = r1     // Catch: java.lang.Throwable -> L236
                r9.sendMessage(r10)     // Catch: java.lang.Throwable -> L236
                return
            L136:
                java.lang.Object r10 = r10.obj     // Catch: java.lang.Throwable -> L236
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L236
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L236
                if (r0 == 0) goto L144
                goto L1f4
            L144:
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r0 = com.baidu.liantian.rp.b.a.a(r0)     // Catch: java.lang.Throwable -> L236
                java.lang.String r10 = com.baidu.liantian.b.o.a(r10)     // Catch: java.lang.Throwable -> L236
                r0.a(r10)     // Catch: java.lang.Throwable -> L236
                return
            L154:
                java.lang.Object r10 = r10.obj     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.a.a r10 = (com.baidu.liantian.rp.a.a) r10     // Catch: java.lang.Throwable -> L236
                if (r10 != 0) goto L15c
                goto L1f4
            L15c:
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.e r1 = r0.a     // Catch: java.lang.Throwable -> L236
                java.lang.String r2 = r10.f6001e     // Catch: java.lang.Throwable -> L236
                java.lang.String r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.c.a r2 = new com.baidu.liantian.rp.c.a     // Catch: java.lang.Throwable -> L236
                r2.<init>()     // Catch: java.lang.Throwable -> L236
                java.lang.String r5 = r10.f6001e     // Catch: java.lang.Throwable -> L236
                r2.f6006b = r5     // Catch: java.lang.Throwable -> L236
                r2.f6011g = r3     // Catch: java.lang.Throwable -> L236
                r2.f6007c = r4     // Catch: java.lang.Throwable -> L236
                long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L236
                r2.f6009e = r5     // Catch: java.lang.Throwable -> L236
                r2.f6010f = r4     // Catch: java.lang.Throwable -> L236
                android.content.Context r5 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r1 = com.baidu.liantian.b.e.a(r5, r10, r1, r3)     // Catch: java.lang.Throwable -> L236
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L236
                r2.f6008d = r1     // Catch: java.lang.Throwable -> L236
                android.content.Context r1 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r1 = com.baidu.liantian.rp.b.a.a(r1)     // Catch: java.lang.Throwable -> L236
                r1.a(r2)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.e r1 = r0.a     // Catch: java.lang.Throwable -> L236
                java.lang.String r3 = r10.f6001e     // Catch: java.lang.Throwable -> L236
                android.content.SharedPreferences$Editor r5 = r1.f5995f     // Catch: java.lang.Throwable -> L236
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L236
                java.lang.String r7 = "re_net_ins_"
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L236
                r6.append(r3)     // Catch: java.lang.Throwable -> L236
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L236
                r5.putBoolean(r3, r4)     // Catch: java.lang.Throwable -> L236
                android.content.SharedPreferences$Editor r1 = r1.f5995f     // Catch: java.lang.Throwable -> L236
                r1.commit()     // Catch: java.lang.Throwable -> L236
                android.content.Context r1 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r1 = com.baidu.liantian.b.e.n(r1)     // Catch: java.lang.Throwable -> L236
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L236
                java.lang.String r1 = com.baidu.liantian.b.o.a(r1)     // Catch: java.lang.Throwable -> L236
                android.content.Context r3 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r3 = com.baidu.liantian.rp.b.a.a(r3)     // Catch: java.lang.Throwable -> L236
                boolean r3 = r3.b(r1)     // Catch: java.lang.Throwable -> L236
                if (r3 == 0) goto L1f4
                java.lang.String r3 = "1001001"
                r2.f6006b = r3     // Catch: java.lang.Throwable -> L236
                android.content.Context r4 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                java.lang.String r5 = r10.a     // Catch: java.lang.Throwable -> L236
                java.lang.String r10 = r10.f5999c     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r6 = com.baidu.liantian.b.e.n(r4)     // Catch: java.lang.Throwable -> L236
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L236
                org.json.JSONObject r10 = com.baidu.liantian.b.e.a(r4, r5, r10, r3, r6)     // Catch: java.lang.Throwable -> L236
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L236
                r2.f6008d = r10     // Catch: java.lang.Throwable -> L236
                android.content.Context r10 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r10 = com.baidu.liantian.rp.b.a.a(r10)     // Catch: java.lang.Throwable -> L236
                r10.a(r2)     // Catch: java.lang.Throwable -> L236
                android.content.Context r10 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r10 = com.baidu.liantian.rp.b.a.a(r10)     // Catch: java.lang.Throwable -> L236
                r10.a(r1)     // Catch: java.lang.Throwable -> L236
            L1f4:
                return
            L1f5:
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.b(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r10 = r10.f6017b     // Catch: java.lang.Throwable -> L236
                int r10 = com.baidu.liantian.b.e.o(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.a(r0, r3, r10)     // Catch: java.lang.Throwable -> L236
                return
            L213:
                java.lang.Object r10 = r10.obj     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.c.a r10 = (com.baidu.liantian.rp.c.a) r10     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a r0 = r9.a     // Catch: java.lang.Throwable -> L236
                android.content.Context r0 = r0.f6017b     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.b.a r0 = com.baidu.liantian.rp.b.a.a(r0)     // Catch: java.lang.Throwable -> L236
                r0.a(r10)     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L236
                android.os.Message r10 = new android.os.Message     // Catch: java.lang.Throwable -> L236
                r10.<init>()     // Catch: java.lang.Throwable -> L236
                r10.what = r1     // Catch: java.lang.Throwable -> L236
                r9.sendMessage(r10)     // Catch: java.lang.Throwable -> L236
                return
            L230:
                com.baidu.liantian.rp.f.a r10 = r9.a     // Catch: java.lang.Throwable -> L236
                com.baidu.liantian.rp.f.a.b(r10)     // Catch: java.lang.Throwable -> L236
                return
            L236:
                com.baidu.liantian.b.e.a()
                return
        }
    }

    public a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.f6017b = r2
            com.baidu.liantian.rp.f.a$a r2 = new com.baidu.liantian.rp.f.a$a
            android.os.Looper r0 = com.baidu.liantian.b.l.a()
            r2.<init>(r1, r0)
            r1.f6020e = r2
            com.baidu.liantian.e r2 = new com.baidu.liantian.e
            android.content.Context r0 = r1.f6017b
            r2.<init>(r0)
            r1.a = r2
            com.baidu.liantian.rp.d.a.a r2 = new com.baidu.liantian.rp.d.a.a
            android.content.Context r0 = r1.f6017b
            r2.<init>(r0)
            r1.f6018c = r2
            return
    }

    static java.lang.String a(org.json.JSONObject r3) {
            java.lang.String r0 = "12"
            r1 = 0
            java.lang.String r2 = "Common_section"
            org.json.JSONObject r3 = r3.getJSONObject(r2)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L19
            boolean r2 = r3.has(r0)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L12
            goto L19
        L12:
            java.lang.String r2 = ""
            java.lang.String r3 = r3.optString(r0, r2)     // Catch: java.lang.Throwable -> L1a
            return r3
        L19:
            return r1
        L1a:
            com.baidu.liantian.b.e.a()
            return r1
    }

    static /* synthetic */ void a(com.baidu.liantian.rp.f.a r8) {
            java.lang.String r0 = "s1"
            long r1 = java.lang.System.currentTimeMillis()
            com.baidu.liantian.e r3 = r8.a
            android.content.SharedPreferences r3 = r3.f5994e
            r4 = 0
            java.lang.String r6 = "re_net_pu_de"
            long r3 = r3.getLong(r6, r4)
            long r1 = r1 - r3
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L11a
            com.baidu.liantian.rp.d.a.a r1 = r8.f6018c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r2.<init>()     // Catch: java.lang.Throwable -> L107
            java.lang.String r3 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L107
            r2.append(r3)     // Catch: java.lang.Throwable -> L107
            java.lang.String r3 = "p/1/rs"
            r2.append(r3)     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L107
            android.content.Context r3 = r1.a     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = ""
            r5 = 0
            r7 = 1
            java.lang.String r2 = com.baidu.liantian.b.h.a(r3, r2, r4, r5, r7)     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L107
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L107
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = "c"
            org.json.JSONObject r2 = r3.getJSONObject(r2)     // Catch: java.lang.Throwable -> L107
            com.baidu.liantian.e r3 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L107
            android.content.Context r1 = r1.a     // Catch: java.lang.Throwable -> L107
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L107
            java.lang.String r1 = "n"
            int r1 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L107
            if (r1 <= 0) goto L64
            android.content.SharedPreferences$Editor r4 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "re_net_ty"
            r4.putInt(r5, r1)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r1.commit()     // Catch: java.lang.Throwable -> L107
        L64:
            java.lang.String r1 = "i"
            int r1 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L107
            if (r1 <= 0) goto L78
            android.content.SharedPreferences$Editor r4 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "re_net_hr"
            r4.putInt(r5, r1)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r1.commit()     // Catch: java.lang.Throwable -> L107
        L78:
            java.lang.String r1 = "i2"
            int r1 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L107
            if (r1 <= 0) goto L8c
            android.content.SharedPreferences$Editor r4 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "re_net_hr_bc"
            r4.putInt(r5, r1)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r1.commit()     // Catch: java.lang.Throwable -> L107
        L8c:
            java.lang.String r1 = "w"
            int r1 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L107
            if (r1 <= 0) goto La0
            android.content.SharedPreferences$Editor r4 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "re_net_wt"
            r4.putInt(r5, r1)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r1.commit()     // Catch: java.lang.Throwable -> L107
        La0:
            int r1 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L107
            if (r1 <= 0) goto Lb6
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = "re_net_one_lt"
            r1.putInt(r4, r0)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r0 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r0.commit()     // Catch: java.lang.Throwable -> L107
        Lb6:
            java.lang.String r0 = "s2"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L107
            if (r0 <= 0) goto Lca
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = "re_net_dy_lt"
            r1.putInt(r4, r0)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r0 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r0.commit()     // Catch: java.lang.Throwable -> L107
        Lca:
            java.lang.String r0 = "t"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L107
            if (r0 <= 0) goto Lde
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = "re_net_over"
            r1.putInt(r4, r0)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r0 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r0.commit()     // Catch: java.lang.Throwable -> L107
        Lde:
            java.lang.String r0 = "l1"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L107
            if (r0 <= 0) goto Lf2
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = "up_nu_co"
            r1.putInt(r4, r0)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r0 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r0.commit()     // Catch: java.lang.Throwable -> L107
        Lf2:
            java.lang.String r0 = "l2"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L107
            if (r0 <= 0) goto L10a
            android.content.SharedPreferences$Editor r1 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = "up_nu_li"
            r1.putInt(r2, r0)     // Catch: java.lang.Throwable -> L107
            android.content.SharedPreferences$Editor r0 = r3.f5995f     // Catch: java.lang.Throwable -> L107
            r0.commit()     // Catch: java.lang.Throwable -> L107
            goto L10a
        L107:
            com.baidu.liantian.b.e.a()
        L10a:
            com.baidu.liantian.e r8 = r8.a
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r8.f5995f
            r2.putLong(r6, r0)
            android.content.SharedPreferences$Editor r8 = r8.f5995f
            r8.commit()
        L11a:
            return
    }

    static /* synthetic */ void a(com.baidu.liantian.rp.f.a r19, int r20, int r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            if (r2 != 0) goto Lc
            com.baidu.liantian.b.a()
            return
        Lc:
            r3 = 0
            r4 = 3
            r5 = 1
            if (r1 != r5) goto L24
            android.content.Context r6 = r0.f6017b
            com.baidu.liantian.rp.b.a r6 = com.baidu.liantian.rp.b.a.a(r6)
            java.util.List r6 = r6.a()
            if (r5 != r2) goto L4f
            r6.size()
            com.baidu.liantian.b.a()
            goto L4f
        L24:
            if (r1 != r4) goto L31
            android.content.Context r6 = r0.f6017b
            com.baidu.liantian.rp.b.a r6 = com.baidu.liantian.rp.b.a.a(r6)
            java.util.List r6 = r6.a(r3, r2)
            goto L4f
        L31:
            r6 = 4
            if (r1 != r6) goto L45
            android.content.Context r6 = r0.f6017b
            com.baidu.liantian.rp.b.a r6 = com.baidu.liantian.rp.b.a.a(r6)
            java.util.List r6 = r6.a(r5, r2)
            r6.size()
            com.baidu.liantian.b.a()
            goto L4f
        L45:
            android.content.Context r6 = r0.f6017b
            com.baidu.liantian.rp.b.a r6 = com.baidu.liantian.rp.b.a.a(r6)
            java.util.List r6 = r6.a(r2)
        L4f:
            int r7 = r6.size()
            if (r7 > 0) goto L59
            com.baidu.liantian.b.a()
            return
        L59:
            com.baidu.liantian.e r7 = r0.a
            android.content.SharedPreferences r7 = r7.f5994e
            java.lang.String r8 = "re_day_len"
            r9 = 0
            long r7 = r7.getLong(r8, r9)
            long r11 = java.lang.System.currentTimeMillis()
            com.baidu.liantian.e r13 = r0.a
            android.content.SharedPreferences r13 = r13.f5994e
            java.lang.String r14 = "re_day_b_t"
            long r13 = r13.getLong(r14, r9)
            com.baidu.liantian.e r15 = r0.a
            android.content.SharedPreferences r15 = r15.f5994e
            r16 = 1
            java.lang.String r5 = "re_net_dy_lt"
            r17 = r9
            r9 = 50
            int r5 = r15.getInt(r5, r9)
            int r9 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r9 != 0) goto L8d
            com.baidu.liantian.e r9 = r0.a
            r9.f(r11)
            r13 = r11
        L8d:
            com.baidu.liantian.b.a()
            com.baidu.liantian.b.a()
            long r9 = r11 - r13
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 >= 0) goto Lc9
            com.baidu.liantian.b.a()
            if (r1 != r4) goto Lbc
            com.baidu.liantian.e r4 = r0.a
            android.content.SharedPreferences r4 = r4.f5994e
            java.lang.String r9 = "g_r_d_d_n"
            int r3 = r4.getInt(r9, r3)
            com.baidu.liantian.b.a()
            r4 = 5
            if (r3 < r4) goto Lb5
            com.baidu.liantian.b.a()
            return
        Lb5:
            com.baidu.liantian.e r4 = r0.a
            int r3 = r3 + 1
            r4.h(r3)
        Lbc:
            r3 = 1048576(0x100000, float:1.469368E-39)
            int r5 = r5 * r3
            long r3 = (long) r5
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto Ldc
            com.baidu.liantian.b.a()
            return
        Lc9:
            com.baidu.liantian.e r5 = r0.a
            r9 = r17
            r5.e(r9)
            com.baidu.liantian.e r5 = r0.a
            r5.f(r11)
            if (r1 != r4) goto Ldc
            com.baidu.liantian.e r4 = r0.a
            r4.h(r3)
        Ldc:
            r0.a(r6, r2, r7)
            r3 = 0
            if (r1 == 0) goto Le4
        Le2:
            r6 = r3
            goto Lf3
        Le4:
            r4 = 2
            if (r2 == r4) goto Le8
            goto Le2
        Le8:
            android.content.Context r3 = r0.f6017b
            com.baidu.liantian.rp.b.a r3 = com.baidu.liantian.rp.b.a.a(r3)
            java.util.List r3 = r3.a(r2)
            goto Le2
        Lf3:
            if (r6 == 0) goto Lfb
            int r3 = r6.size()
            if (r3 != 0) goto Ldc
        Lfb:
            return
    }

    private void a(java.util.List<com.baidu.liantian.rp.c.a> r11, int r12, long r13) {
            r10 = this;
            com.baidu.liantian.e r0 = r10.a
            android.content.SharedPreferences r0 = r0.f5994e
            java.lang.String r1 = "re_net_one_lt"
            r2 = 5
            int r0 = r0.getInt(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
            r3 = 0
            r4 = 0
        L1b:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r11.next()
            com.baidu.liantian.rp.c.a r5 = (com.baidu.liantian.rp.c.a) r5
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L67
            java.lang.String r7 = r5.f6008d     // Catch: java.lang.Exception -> L67
            r6.<init>(r7)     // Catch: java.lang.Exception -> L67
            android.content.Context r7 = r10.f6017b
            org.json.JSONObject r6 = com.baidu.liantian.b.e.a(r7, r6)
            java.lang.String r6 = r6.toString()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
            r7.<init>(r6)     // Catch: java.lang.Exception -> L63
            int r6 = r6.length()
            int r6 = r6 + r4
            r8 = 1048576(0x100000, float:1.469368E-39)
            int r8 = r8 * r0
            if (r6 < r8) goto L4c
            com.baidu.liantian.b.a()
            goto L6b
        L4c:
            int r4 = r5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            com.baidu.liantian.rp.c.b r4 = new com.baidu.liantian.rp.c.b
            java.lang.String r8 = r5.f6014j
            int r5 = r5.a
            r4.<init>(r7, r8, r5)
            r2.add(r4)
            r4 = r6
            goto L1b
        L63:
            com.baidu.liantian.b.e.a()
            goto L1b
        L67:
            com.baidu.liantian.b.e.a()
            goto L1b
        L6b:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L7f:
            int r6 = r2.size()
            if (r3 >= r6) goto Le9
            java.lang.Object r6 = r2.get(r3)
            com.baidu.liantian.rp.c.b r6 = (com.baidu.liantian.rp.c.b) r6
            if (r6 == 0) goto Le6
            java.lang.String r7 = r6.f6015b
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto La4
            org.json.JSONObject r7 = r6.a
            r1.put(r7)
            int r6 = r6.f6016c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto Le6
        La4:
            boolean r8 = r11.containsKey(r7)
            if (r8 == 0) goto Lc0
            java.lang.Object r8 = r11.get(r7)
            org.json.JSONArray r8 = (org.json.JSONArray) r8
            if (r8 != 0) goto Lb7
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
        Lb7:
            org.json.JSONObject r9 = r6.a
            r8.put(r9)
            r11.put(r7, r8)
            goto Lcd
        Lc0:
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            org.json.JSONObject r9 = r6.a
            r8.put(r9)
            r11.put(r7, r8)
        Lcd:
            java.lang.Object r8 = r0.get(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto Lda
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        Lda:
            int r6 = r6.f6016c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.add(r6)
            r0.put(r7, r8)
        Le6:
            int r3 = r3 + 1
            goto L7f
        Le9:
            com.baidu.liantian.b.a()
            int r2 = r1.length()
            if (r2 <= 0) goto L10c
            com.baidu.liantian.rp.d.a.a r2 = r10.f6018c
            java.lang.String r1 = r1.toString()
            r3 = 0
            boolean r1 = r2.a(r1, r3)
            if (r1 == 0) goto L10f
            com.baidu.liantian.b.a()
            android.content.Context r1 = r10.f6017b
            com.baidu.liantian.rp.b.a r1 = com.baidu.liantian.rp.b.a.a(r1)
            r1.a(r5)
            goto L10f
        L10c:
            com.baidu.liantian.b.a()
        L10f:
            int r1 = r11.size()
            if (r1 <= 0) goto L156
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        L11d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L159
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            if (r3 == 0) goto L11d
            int r5 = r3.length()
            if (r5 <= 0) goto L11d
            com.baidu.liantian.rp.d.a.a r5 = r10.f6018c
            java.lang.String r3 = r3.toString()
            boolean r3 = r5.a(r3, r2)
            if (r3 == 0) goto L11d
            com.baidu.liantian.b.a()
            android.content.Context r3 = r10.f6017b
            com.baidu.liantian.rp.b.a r3 = com.baidu.liantian.rp.b.a.a(r3)
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            r3.a(r2)
            goto L11d
        L156:
            com.baidu.liantian.b.a()
        L159:
            android.content.Context r11 = r10.f6017b
            com.baidu.liantian.rp.b.a r11 = com.baidu.liantian.rp.b.a.a(r11)
            r11.c()
            r11 = 2
            if (r11 == r12) goto L16c
            com.baidu.liantian.e r11 = r10.a
            long r0 = (long) r4
            long r0 = r0 + r13
            r11.e(r0)
        L16c:
            return
    }

    private boolean a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.Context r0 = r4.f6017b
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r6.equals(r0)
            r2 = 1
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L36
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L36
            r0.<init>(r5)     // Catch: java.lang.Exception -> L36
            r5 = 0
        L22:
            int r3 = r0.length()     // Catch: java.lang.Exception -> L36
            if (r5 >= r3) goto L36
            java.lang.Object r3 = r0.get(r5)     // Catch: java.lang.Exception -> L36
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L33
            return r2
        L33:
            int r5 = r5 + 1
            goto L22
        L36:
            return r1
    }

    static /* synthetic */ void b(com.baidu.liantian.rp.f.a r11) {
            com.baidu.liantian.e r0 = r11.a
            java.util.List r0 = r0.w()
            if (r0 == 0) goto Lec
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lec
            java.lang.Object r1 = r0.next()
            com.baidu.liantian.rp.a.a r1 = (com.baidu.liantian.rp.a.a) r1
            com.baidu.liantian.e r2 = r11.a
            android.content.SharedPreferences r2 = r2.f5994e
            java.lang.String r3 = "li_pk_s"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.String r3 = r1.f5998b
            boolean r2 = r11.a(r2, r3)
            if (r2 == 0) goto Lc
            com.baidu.liantian.e r2 = r11.a
            java.lang.String r3 = r1.f6000d
            android.content.SharedPreferences r2 = r2.f5994e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "re_net_ali2_"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.String r3 = com.baidu.liantian.b.e.c()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc
            com.baidu.liantian.e r2 = r11.a
            java.lang.String r4 = r1.f6000d
            java.lang.String r2 = r2.b(r4)
            com.baidu.liantian.rp.c.a r4 = new com.baidu.liantian.rp.c.a
            r4.<init>()
            java.lang.String r5 = r1.f6000d
            r4.f6006b = r5
            r5 = 0
            r4.f6011g = r5
            r7 = 2
            r4.f6007c = r7
            long r7 = java.lang.System.currentTimeMillis()
            r4.f6009e = r7
            r7 = 1
            r4.f6010f = r7
            r8 = 5
            r4.f6013i = r8
            android.content.Context r8 = r11.f6017b
            org.json.JSONObject r2 = com.baidu.liantian.b.e.a(r8, r1, r2, r7)
            java.lang.String r2 = r2.toString()
            r4.f6008d = r2
            android.content.Context r2 = r11.f6017b
            com.baidu.liantian.rp.b.a r2 = com.baidu.liantian.rp.b.a.a(r2)
            r2.a(r4)
            android.content.Context r2 = r11.f6017b
            org.json.JSONObject r2 = com.baidu.liantian.b.e.n(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.baidu.liantian.b.o.a(r2)
            android.content.Context r7 = r11.f6017b
            com.baidu.liantian.rp.b.a r7 = com.baidu.liantian.rp.b.a.a(r7)
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto Ld0
            java.lang.String r7 = "1001001"
            r4.f6006b = r7
            r4.f6013i = r5
            android.content.Context r5 = r11.f6017b
            java.lang.String r8 = r1.a
            java.lang.String r9 = r1.f5999c
            org.json.JSONObject r10 = com.baidu.liantian.b.e.n(r5)
            java.lang.String r10 = r10.toString()
            org.json.JSONObject r5 = com.baidu.liantian.b.e.a(r5, r8, r9, r7, r10)
            java.lang.String r5 = r5.toString()
            r4.f6008d = r5
            android.content.Context r5 = r11.f6017b
            com.baidu.liantian.rp.b.a r5 = com.baidu.liantian.rp.b.a.a(r5)
            r5.a(r4)
            android.content.Context r4 = r11.f6017b
            com.baidu.liantian.rp.b.a r4 = com.baidu.liantian.rp.b.a.a(r4)
            r4.a(r2)
        Ld0:
            com.baidu.liantian.e r2 = r11.a
            java.lang.String r1 = r1.f6000d
            android.content.SharedPreferences$Editor r4 = r2.f5995f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.putString(r1, r3)
            android.content.SharedPreferences$Editor r1 = r2.f5995f
            r1.commit()
            goto Lc
        Lec:
            return
    }

    public final void a(android.os.Message r2) {
            r1 = this;
            com.baidu.liantian.rp.f.a$a r0 = r1.f6020e
            r0.sendMessage(r2)
            return
    }
}
