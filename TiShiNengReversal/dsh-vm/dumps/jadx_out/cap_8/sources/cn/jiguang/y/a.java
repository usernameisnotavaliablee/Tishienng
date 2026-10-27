package cn.jiguang.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.util.LinkedHashSet<java.lang.String>> f1550b;


    /* renamed from: cn.jiguang.y.a$a, reason: collision with other inner class name */
    private static final class C0047a {
        private static final cn.jiguang.y.a a = null;

        static {
                cn.jiguang.y.a r0 = new cn.jiguang.y.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.y.a.C0047a.a = r0
                return
        }

        public C0047a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.y.a a() {
                cn.jiguang.y.a r0 = cn.jiguang.y.a.C0047a.a
                return r0
        }
    }

    private a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1550b = r0
            return
    }

    /* synthetic */ a(cn.jiguang.y.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(org.json.JSONObject r8) {
            r7 = this;
            if (r8 == 0) goto L46
            int r0 = r8.length()
            if (r0 != 0) goto L9
            goto L46
        L9:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: org.json.JSONException -> L46
            r0.<init>()     // Catch: org.json.JSONException -> L46
            java.util.Iterator r1 = r8.keys()     // Catch: org.json.JSONException -> L46
        L12:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L46
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L46
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L46
            org.json.JSONArray r3 = r8.optJSONArray(r2)     // Catch: org.json.JSONException -> L46
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet     // Catch: org.json.JSONException -> L46
            r4.<init>()     // Catch: org.json.JSONException -> L46
            if (r3 == 0) goto L3a
            r5 = 0
        L2a:
            int r6 = r3.length()     // Catch: org.json.JSONException -> L46
            if (r5 >= r6) goto L3a
            java.lang.String r6 = r3.getString(r5)     // Catch: org.json.JSONException -> L46
            r4.add(r6)     // Catch: org.json.JSONException -> L46
            int r5 = r5 + 1
            goto L2a
        L3a:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L46
            goto L12
        L3e:
            boolean r8 = r0.isEmpty()     // Catch: org.json.JSONException -> L46
            if (r8 != 0) goto L46
            r7.f1550b = r0     // Catch: org.json.JSONException -> L46
        L46:
            return
    }

    public static cn.jiguang.y.a b() {
            cn.jiguang.y.a r0 = cn.jiguang.y.a.C0047a.a()
            return r0
    }

    public cn.jiguang.y.a a(android.content.Context r13, boolean r14) {
            r12 = this;
            java.lang.String r1 = "AddressGroupManager"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L93
            r12.b(r13)     // Catch: java.lang.Throwable -> L93
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aj()     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = cn.jiguang.e.b.a(r13, r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L93
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L93
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L21
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L29
        L21:
            r8 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L29
            r2 = r8
        L29:
            r8 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L31
            goto L32
        L31:
            r8 = r2
        L32:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r0 = cn.jiguang.av.e.a(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "lastUpdateTime="
            r2.append(r3)     // Catch: java.lang.Throwable -> L93
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Throwable -> L93
            long r10 = r12.a     // Catch: java.lang.Throwable -> L93
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L93
            r2.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = " now="
            r2.append(r3)     // Catch: java.lang.Throwable -> L93
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Throwable -> L93
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r0.format(r3)     // Catch: java.lang.Throwable -> L93
            r2.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = " expire="
            r2.append(r0)     // Catch: java.lang.Throwable -> L93
            r10 = 1000(0x3e8, double:4.94E-321)
            long r10 = r8 / r10
            r2.append(r10)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L93
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L93
            long r2 = r12.a     // Catch: java.lang.Throwable -> L93
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L80
            long r2 = r2 + r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto Lb9
        L80:
            java.lang.String r0 = "cache invalid, fetch new urls"
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L93
            java.util.Map<java.lang.String, java.util.LinkedHashSet<java.lang.String>> r0 = r12.f1550b     // Catch: java.lang.Throwable -> L93
            r2 = 0
            if (r0 == 0) goto L96
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L91
            goto L96
        L91:
            r0 = 0
            goto L97
        L93:
            r0 = move-exception
            r13 = r0
            goto Lba
        L96:
            r0 = 1
        L97:
            if (r0 == 0) goto La0
            java.lang.String r14 = "cacheInvalid is true"
            cn.jiguang.w.f.c(r1, r14)     // Catch: java.lang.Throwable -> L93
            r3 = 0
            goto La1
        La0:
            r3 = r14
        La1:
            long r6 = r12.a     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = "sis"
            cn.jiguang.y.a$1 r11 = new cn.jiguang.y.a$1     // Catch: java.lang.Throwable -> L93
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L93
            r2 = r13
            boolean r13 = cn.jiguang.v.l.b.a(r2, r3, r4, r6, r8, r10, r11)     // Catch: java.lang.Throwable -> L93
            if (r13 != 0) goto Lb9
            java.lang.String r13 = "fetch run"
            cn.jiguang.w.f.c(r1, r13)     // Catch: java.lang.Throwable -> L93
            cn.jiguang.y.f.a(r2, r0)     // Catch: java.lang.Throwable -> L93
        Lb9:
            return r12
        Lba:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "refresh e"
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            cn.jiguang.w.f.i(r1, r13)
            return r12
    }

    public java.lang.Integer a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String a(java.lang.String r11) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r1 = "normal"
            if (r0 == 0) goto L9
            return r1
        L9:
            r11.getClass()
            int r0 = r11.hashCode()
            java.lang.String r2 = "sc_status"
            java.lang.String r3 = "awake"
            java.lang.String r4 = "android_notification_state"
            java.lang.String r5 = "active_user"
            java.lang.String r6 = "scenarios_msg"
            java.lang.String r7 = "account"
            java.lang.String r8 = "scenarios_state"
            r9 = -1
            switch(r0) {
                case -1736429515: goto Led;
                case -1245458676: goto Le2;
                case -1177318867: goto Ld9;
                case -1159353307: goto Ld0;
                case -1091230153: goto Lc5;
                case -1051289244: goto Lbc;
                case -1039745817: goto Lb3;
                case -820729752: goto La8;
                case -693746763: goto L9c;
                case -295020531: goto L90;
                case -31313123: goto L82;
                case 96275: goto L74;
                case 2986591: goto L66;
                case 93223301: goto L5a;
                case 856687809: goto L4e;
                case 907150721: goto L40;
                case 1350272347: goto L32;
                case 1973539834: goto L24;
                default: goto L22;
            }
        L22:
            goto Lf5
        L24:
            java.lang.String r0 = "identify_account"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L2e
            goto Lf5
        L2e:
            r9 = 17
            goto Lf5
        L32:
            java.lang.String r0 = "android_awake_target"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L3c
            goto Lf5
        L3c:
            r9 = 16
            goto Lf5
        L40:
            java.lang.String r0 = "detach_account"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L4a
            goto Lf5
        L4a:
            r9 = 15
            goto Lf5
        L4e:
            boolean r0 = r11.equals(r2)
            if (r0 != 0) goto L56
            goto Lf5
        L56:
            r9 = 14
            goto Lf5
        L5a:
            boolean r0 = r11.equals(r3)
            if (r0 != 0) goto L62
            goto Lf5
        L62:
            r9 = 13
            goto Lf5
        L66:
            java.lang.String r0 = "aat3"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L70
            goto Lf5
        L70:
            r9 = 12
            goto Lf5
        L74:
            java.lang.String r0 = "aa3"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L7e
            goto Lf5
        L7e:
            r9 = 11
            goto Lf5
        L82:
            java.lang.String r0 = "android_awake2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L8c
            goto Lf5
        L8c:
            r9 = 10
            goto Lf5
        L90:
            boolean r0 = r11.equals(r4)
            if (r0 != 0) goto L98
            goto Lf5
        L98:
            r9 = 9
            goto Lf5
        L9c:
            java.lang.String r0 = "android_awake"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto La5
            goto Lf5
        La5:
            r9 = 8
            goto Lf5
        La8:
            java.lang.String r0 = "active_terminate"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto Lb1
            goto Lf5
        Lb1:
            r9 = 7
            goto Lf5
        Lb3:
            boolean r0 = r11.equals(r1)
            if (r0 != 0) goto Lba
            goto Lf5
        Lba:
            r9 = 6
            goto Lf5
        Lbc:
            boolean r0 = r11.equals(r5)
            if (r0 != 0) goto Lc3
            goto Lf5
        Lc3:
            r9 = 5
            goto Lf5
        Lc5:
            java.lang.String r0 = "android_awake_target2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto Lce
            goto Lf5
        Lce:
            r9 = 4
            goto Lf5
        Ld0:
            boolean r0 = r11.equals(r6)
            if (r0 != 0) goto Ld7
            goto Lf5
        Ld7:
            r9 = 3
            goto Lf5
        Ld9:
            boolean r0 = r11.equals(r7)
            if (r0 != 0) goto Le0
            goto Lf5
        Le0:
            r9 = 2
            goto Lf5
        Le2:
            java.lang.String r0 = "active_launch"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto Leb
            goto Lf5
        Leb:
            r9 = 1
            goto Lf5
        Led:
            boolean r0 = r11.equals(r8)
            if (r0 != 0) goto Lf4
            goto Lf5
        Lf4:
            r9 = 0
        Lf5:
            switch(r9) {
                case 0: goto L109;
                case 1: goto L108;
                case 2: goto L107;
                case 3: goto L106;
                case 4: goto L105;
                case 5: goto L108;
                case 6: goto L104;
                case 7: goto L108;
                case 8: goto L105;
                case 9: goto L103;
                case 10: goto L105;
                case 11: goto L105;
                case 12: goto L105;
                case 13: goto L105;
                case 14: goto L102;
                case 15: goto L107;
                case 16: goto L105;
                case 17: goto L107;
                default: goto Lf8;
            }
        Lf8:
            java.util.Map<java.lang.String, java.util.LinkedHashSet<java.lang.String>> r0 = r10.f1550b
            boolean r0 = r0.containsKey(r11)
            if (r0 != 0) goto L101
            return r1
        L101:
            return r11
        L102:
            return r2
        L103:
            return r4
        L104:
            return r1
        L105:
            return r3
        L106:
            return r6
        L107:
            return r7
        L108:
            return r5
        L109:
            return r8
    }

    public java.lang.String a(java.util.Set<java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "normal"
            if (r4 == 0) goto L33
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto Lb
            goto L33
        Lb:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L33
            r1 = 0
        L10:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L32
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L24
            r1 = r2
            goto L10
        L24:
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L10
            java.lang.String r4 = "AddressGroupManager"
            java.lang.String r1 = "Report JSONArray belong more than one space, using normal-space"
            cn.jiguang.w.f.i(r4, r1)     // Catch: java.lang.Throwable -> L33
            return r0
        L32:
            return r1
        L33:
            return r0
    }

    public void a(android.content.Context r2) {
            r1 = this;
            r0 = 0
            cn.jiguang.y.f.a(r2, r0)
            return
    }

    public void a(android.content.Context r9, org.json.JSONObject r10) {
            r8 = this;
            java.lang.String r0 = "sis_ips"
            org.json.JSONArray r0 = r10.optJSONArray(r0)
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.String r3 = "ttl"
            long r3 = r10.getLong(r3)     // Catch: org.json.JSONException -> L18
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L16
            goto L19
        L16:
            r1 = r3
            goto L19
        L18:
        L19:
            java.lang.String r3 = "ips"
            org.json.JSONObject r10 = r10.optJSONObject(r3)
            cn.jiguang.e.a r3 = cn.jiguang.e.a.ah()
            java.lang.String r0 = r0.toString()
            cn.jiguang.e.a r0 = r3.a(r0)
            cn.jiguang.e.a r3 = cn.jiguang.e.a.aj()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            cn.jiguang.e.a r1 = r3.a(r1)
            cn.jiguang.e.a r2 = cn.jiguang.e.a.ai()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            cn.jiguang.e.a r2 = r2.a(r3)
            cn.jiguang.e.a r3 = cn.jiguang.e.a.ag()
            if (r10 == 0) goto L56
            java.lang.String r4 = r10.toString()
            goto L58
        L56:
            java.lang.String r4 = ""
        L58:
            cn.jiguang.e.a r3 = r3.a(r4)
            r4 = 4
            cn.jiguang.e.a[] r4 = new cn.jiguang.e.a[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            cn.jiguang.e.b.a(r9, r4)
            r8.a(r10)
            return
    }

    public cn.jiguang.y.a b(android.content.Context r8) {
            r7 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ai()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = cn.jiguang.e.b.a(r8, r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L34
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L34
            long r2 = r7.a     // Catch: java.lang.Throwable -> L34
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1a
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L34
        L1a:
            r7.a = r0     // Catch: java.lang.Throwable -> L34
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ag()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = cn.jiguang.e.b.a(r8, r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L34
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L34
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r7.a(r0)
        L34:
            return r7
    }

    public java.util.Set<java.lang.String> b(java.util.Set<java.lang.String> r5) {
            r4 = this;
            java.lang.String r0 = "normal"
            if (r5 == 0) goto L3e
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Lb
            goto L3e
        Lb:
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L10:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r4.a(r2)
            java.util.Map<java.lang.String, java.util.LinkedHashSet<java.lang.String>> r3 = r4.f1550b
            java.lang.Object r2 = r3.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L3e
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L31
            goto L3e
        L31:
            if (r1 != 0) goto L35
            r1 = r2
            goto L38
        L35:
            r1.retainAll(r2)
        L38:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L10
        L3e:
            java.util.Map<java.lang.String, java.util.LinkedHashSet<java.lang.String>> r5 = r4.f1550b
            java.lang.Object r5 = r5.get(r0)
            java.util.Set r5 = (java.util.Set) r5
            return r5
        L47:
            return r1
    }
}
