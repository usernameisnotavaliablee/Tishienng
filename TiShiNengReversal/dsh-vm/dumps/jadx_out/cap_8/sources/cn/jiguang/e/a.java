package cn.jiguang.e;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a<T> {
    public static java.lang.String a = "cn.jpush.preferences.v2";

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f1264b;

    /* renamed from: c, reason: collision with root package name */
    java.lang.String f1265c;

    /* renamed from: d, reason: collision with root package name */
    T f1266d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1267e;

    /* renamed from: f, reason: collision with root package name */
    boolean f1268f;

    /* renamed from: cn.jiguang.e.a$a, reason: collision with other inner class name */
    public static class C0039a {

        /* renamed from: cn.jiguang.e.a$a$a, reason: collision with other inner class name */
        public static class C0040a {
            public C0040a() {
                    r1 = this;
                    r1.<init>()
                    return
            }

            public static cn.jiguang.e.a<java.lang.Long> a() {
                    cn.jiguang.e.a r0 = new cn.jiguang.e.a
                    r1 = 0
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.lang.String r2 = "cn.jiguang.sdk.user.profile"
                    java.lang.String r3 = "key_uid_e"
                    r0.<init>(r2, r3, r1)
                    cn.jiguang.e.a r0 = cn.jiguang.e.a.a(r0)
                    cn.jiguang.e.a r0 = cn.jiguang.e.a.b(r0)
                    return r0
            }

            public static cn.jiguang.e.a<java.lang.Long> b() {
                    cn.jiguang.e.a r0 = new cn.jiguang.e.a
                    r1 = 0
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.lang.String r2 = "cn.jiguang.sdk.user.profile"
                    java.lang.String r3 = "key_uid"
                    r0.<init>(r2, r3, r1)
                    cn.jiguang.e.a r0 = cn.jiguang.e.a.a(r0)
                    return r0
            }

            public static cn.jiguang.e.a<java.lang.String> c() {
                    cn.jiguang.e.a r0 = new cn.jiguang.e.a
                    java.lang.String r1 = "key_rid_e"
                    java.lang.String r2 = ""
                    java.lang.String r3 = "cn.jiguang.sdk.user.profile"
                    r0.<init>(r3, r1, r2)
                    cn.jiguang.e.a r0 = cn.jiguang.e.a.a(r0)
                    cn.jiguang.e.a r0 = cn.jiguang.e.a.b(r0)
                    return r0
            }

            public static cn.jiguang.e.a<java.lang.String> d() {
                    cn.jiguang.e.a r0 = new cn.jiguang.e.a
                    java.lang.String r1 = "key_rid"
                    java.lang.String r2 = ""
                    java.lang.String r3 = "cn.jiguang.sdk.user.profile"
                    r0.<init>(r3, r1, r2)
                    cn.jiguang.e.a r0 = cn.jiguang.e.a.a(r0)
                    return r0
            }
        }

        public C0039a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public a(java.lang.String r1, java.lang.String r2, T r3) {
            r0 = this;
            r0.<init>()
            r0.f1264b = r1
            r0.f1265c = r2
            if (r3 == 0) goto Lc
            r0.f1266d = r3
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "default value can not be null"
            r1.<init>(r2)
            throw r1
    }

    public static cn.jiguang.e.a<java.lang.Long> A() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_conn_count"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> B() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_conn_res"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> C() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_day_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> D() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "tcp_boot_timestamp"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> E() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "tcp_report_boot_timestamp"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> F() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "tcp_time_report_time"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> G() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.cold_start_main"
            java.lang.String r3 = "cs_cnt"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> H() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.cold_start"
            java.lang.String r3 = "sub_cs_cnt"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> I() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.cold_start"
            java.lang.String r3 = "sub_cs_decr_cnt"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> J() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.cold_start"
            java.lang.String r3 = "main_start_id"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> K() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "tcp_login"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> L() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "report_state"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> M() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.user.profile"
            java.lang.String r3 = "key_uid_e"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> N() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "key_rid_e"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> O() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.user.profile"
            java.lang.String r3 = "key_rid_time"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> P() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "key_ww"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> Q() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "key_pwd"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> R() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.user.profile"
            java.lang.String r3 = "idc"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> S() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.user.profile"
            java.lang.String r3 = "login_local_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> T() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.user.profile"
            java.lang.String r3 = "login_server_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> U() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.user.profile"
            java.lang.String r3 = "sync_auth"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> V() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "key_c"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> W() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "reg_n_rule"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.reg_finger.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> X() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.reg_finger.profile"
            java.lang.String r3 = "reg_new"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> Y() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "exception_switch"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> Z() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "option_channel"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.user.set.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> a() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "devcie_id_generated"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    static /* synthetic */ cn.jiguang.e.a a(cn.jiguang.e.a r0) {
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> a(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sdk_version_"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jpush.android.user.profile"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> a(boolean r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            if (r3 == 0) goto L7
            java.lang.String r3 = "default_https_report"
            goto L9
        L7:
            java.lang.String r3 = "default_http_report"
        L9:
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aX()
            cn.jiguang.e.a r3 = r3.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.Integer> aA() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.preferences.v2.rid"
            java.lang.String r3 = "seq_id"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aB() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "ips_in_last_good_sis"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aC() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "ssl_ips_in_last_good_sis"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> aD() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "udp_data_report"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> aE() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.address"
            java.lang.String r3 = "sis_last_update"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> aF() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.address"
            java.lang.String r3 = "last_sis_report_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aG() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "default_sis_ips"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aH() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "default_conn"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aI() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "default_conn_srv"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aJ() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "tcp_report"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.address"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aK() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "key"
            java.lang.String r2 = ""
            java.lang.String r3 = "PrefsFile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> aL() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "internal_debug"
            java.lang.String r3 = "log_enable"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> aM() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "internal_debug"
            java.lang.String r3 = "cmd_print_log"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> aN() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "internal_debug"
            java.lang.String r3 = "expire"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> aO() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "internal_debug"
            java.lang.String r3 = "delay_upload"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> aP() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "internal_debug"
            java.lang.String r3 = "sentry_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> aQ() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "sentry_sample_switch"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "internal_debug"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> aR() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "net_m_switch"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "internal_debug"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aS() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "di_ml"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.device"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aT() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "di_mft"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.device"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aU() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "di_rm"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.device"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aV() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "de_info"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.device"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aW() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "loc_info"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.device"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    private cn.jiguang.e.a<T> aX() {
            r1 = this;
            r0 = 1
            r1.f1267e = r0
            return r1
    }

    private cn.jiguang.e.a<T> aY() {
            r1 = this;
            r0 = 1
            r1.f1268f = r0
            return r1
    }

    public static cn.jiguang.e.a<java.lang.String> aa() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "analytics_account_id"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.user.set.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> ab() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "is_ups_register"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jiguang.sdk.user.set.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> ac() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Push_Page_Config"
            java.lang.String r3 = "css"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> ad() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Push_Page_Config"
            java.lang.String r3 = "cse"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> ae() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Push_Page_Config"
            java.lang.String r3 = "last_pause"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> af() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "session_id"
            java.lang.String r2 = ""
            java.lang.String r3 = "Push_Page_Config"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> ag() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "report_urls"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.report"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> ah() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "report_sis_urls"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jiguang.sdk.report"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> ai() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.report"
            java.lang.String r3 = "last_update_report_urls"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> aj() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.report"
            java.lang.String r3 = "report_urls_ttl_millis"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> ak() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "sp_sdk_version"
            r0.<init>(r1, r3, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> al() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "sdk_version"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> am() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "first_init"
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> an() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "exception_report_mill"
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> ao() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "lbs_delay"
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> ap() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "jcore_lbs_enable"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> aq() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "is_tcp_close"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> ar() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "jpush_register_code"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> as() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "device_config_appkey_n"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> at() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "device_config_appkey"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> au() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "i_new"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> av() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "push_udid"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> aw() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "last_connection_type"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> ax() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = cn.jiguang.e.a.a
            java.lang.String r2 = "sis_report_history"
            java.lang.String r3 = ""
            r0.<init>(r1, r2, r3)
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> ay() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "cmd_export_log"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "internal_debug"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> az() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.preferences.v2.rid"
            java.lang.String r3 = "next_rid"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> b() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "devcie_id_generated_n"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    static /* synthetic */ cn.jiguang.e.a b(cn.jiguang.e.a r0) {
            cn.jiguang.e.a r0 = r0.aY()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> b(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dns_"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.String> b(boolean r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "last_good_sis_address"
            r1.append(r2)
            if (r3 == 0) goto L11
            java.lang.String r3 = "_V4"
            goto L13
        L11:
            java.lang.String r3 = "_V6"
        L13:
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.String> c() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "cid_desc_data"
            java.lang.String r2 = ""
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            cn.jiguang.e.a r0 = r0.aX()
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> c(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dns_last_update_"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> c(boolean r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "last_good_conn"
            r1.append(r2)
            if (r3 == 0) goto L11
            java.lang.String r3 = "_V4"
            goto L13
        L11:
            java.lang.String r3 = "_V6"
        L13:
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.Long> d() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "ex_report_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> d(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "srv_"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.String> d(boolean r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            if (r3 == 0) goto L7
            java.lang.String r3 = "default_https_report"
            goto L9
        L7:
            java.lang.String r3 = "default_http_report"
        L9:
            java.lang.String r1 = ""
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aX()
            cn.jiguang.e.a r3 = r3.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.Long> e() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_data_report_time"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> e(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "srv_last_update_"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jiguang.sdk.address"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> f() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "enable_auto_wakeup"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> f(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "IpInfos"
            java.lang.String r2 = ""
            r0.<init>(r1, r3, r2)
            cn.jiguang.e.a r3 = r0.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.Boolean> g() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "enable_ci"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.String> g(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r3 = cn.jiguang.av.v.d(r3)
            java.lang.String r1 = ""
            java.lang.String r2 = "IpInfos"
            r0.<init>(r2, r3, r1)
            cn.jiguang.e.a r3 = r0.aY()
            return r3
    }

    public static cn.jiguang.e.a<java.lang.Boolean> h() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "enable_dynamicload"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Integer> h(java.lang.String r3) {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "netinfo"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> i() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "enable_appterminate"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> j() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "re_k_e"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> k() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "connect_tcp_key_encrypt"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> l() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "use_connect_tcp_ssl"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> m() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "use_report_tcp_ssl"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> n() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "use_report_tcp_time_switch"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> o() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "count_switch"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> p() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "android_tcpreport_switch"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> q() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "tcp_exception_report_switch"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Boolean> r() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            java.lang.String r1 = "net_length_switch"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "cn.jpush.android.user.profile"
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> s() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            long r1 = cn.jiguang.al.c.f571b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_count_threshold"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> t() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            long r1 = cn.jiguang.al.c.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_length_threshold"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> u() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            long r1 = cn.jiguang.al.c.f573d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_conn_count_threshold"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> v() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            long r1 = cn.jiguang.al.c.f572c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_conn_length_threshold"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> w() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_req"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> x() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_count"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> y() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_res"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static cn.jiguang.e.a<java.lang.Long> z() {
            cn.jiguang.e.a r0 = new cn.jiguang.e.a
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "cn.jpush.android.user.profile"
            java.lang.String r3 = "net_conn_req"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public cn.jiguang.e.a<T> a(T r1) {
            r0 = this;
            r0.f1266d = r1
            return r0
    }

    public cn.jiguang.e.a<T> i(java.lang.String r1) {
            r0 = this;
            r0.f1264b = r1
            return r0
    }

    public cn.jiguang.e.a<T> j(java.lang.String r1) {
            r0 = this;
            r0.f1265c = r1
            return r0
    }
}
