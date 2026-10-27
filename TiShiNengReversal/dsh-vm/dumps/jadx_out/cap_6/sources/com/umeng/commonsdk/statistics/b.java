package com.umeng.commonsdk.statistics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public static java.lang.String a = null;
    public static java.lang.String b = "";
    private static final java.lang.String c = "EnvelopeManager";
    private static final java.lang.String d = "debug.umeng.umTaskId";
    private static final java.lang.String e = "debug.umeng.umCaseId";
    private static final java.lang.String f = "empty";
    private static java.lang.String g = "";
    private static java.lang.String h = "";
    private static java.lang.String i;
    private static java.util.Map<java.lang.String, java.lang.String> j;
    private static boolean l;
    private int k;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.b.j = r0
            java.lang.String r1 = "header"
            java.lang.String r2 = "#h"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "sdk_type"
            java.lang.String r2 = "#sdt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "access"
            java.lang.String r2 = "#ac"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_model"
            java.lang.String r2 = "#dm"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "umid"
            java.lang.String r2 = "#umid"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "os"
            r0.put(r1, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "language"
            java.lang.String r2 = "#lang"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_type"
            java.lang.String r2 = "#dt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "resolution"
            java.lang.String r2 = "#rl"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_manufacturer"
            java.lang.String r2 = "#dmf"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_name"
            java.lang.String r2 = "#dn"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "platform_version"
            java.lang.String r2 = "#pv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "font_size_setting"
            java.lang.String r2 = "#fss"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "os_version"
            java.lang.String r2 = "#ov"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_manuid"
            java.lang.String r2 = "#did"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "platform_sdk_version"
            java.lang.String r2 = "#psv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_brand"
            java.lang.String r2 = "#db"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "appkey"
            java.lang.String r2 = "#ak"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "id_tracking"
            java.lang.String r2 = "#itr"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "id_type"
            java.lang.String r2 = "#it"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "uuid"
            java.lang.String r2 = "#ud"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_id"
            java.lang.String r2 = "#dd"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "imprint"
            java.lang.String r2 = "#imp"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = "#sv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "st"
            java.lang.String r2 = "#st"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "analytics"
            java.lang.String r2 = "#a"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "package_name"
            java.lang.String r2 = "#pkg"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "app_signature"
            java.lang.String r2 = "#sig"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "app_sig_sha1"
            java.lang.String r2 = "#sis1"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "app_sig_sha"
            java.lang.String r2 = "#sis"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "#av"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "version_code"
            java.lang.String r2 = "#vc"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "idmd5"
            java.lang.String r2 = "#imd"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "mccmnc"
            java.lang.String r2 = "#mnc"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_board"
            java.lang.String r2 = "#boa"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "device_manutime"
            java.lang.String r2 = "#mant"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "timezone"
            java.lang.String r2 = "#tz"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "country"
            java.lang.String r2 = "#ct"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "carrier"
            java.lang.String r2 = "#car"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "display_name"
            java.lang.String r2 = "#disn"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "network_type"
            java.lang.String r2 = "#nt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "com_ver"
            java.lang.String r2 = "#cv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "mini_ver"
            java.lang.String r2 = "#mv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "com_type"
            java.lang.String r2 = "#cot"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "module"
            java.lang.String r2 = "#mod"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "api_level"
            java.lang.String r2 = "#al"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "session_id"
            java.lang.String r2 = "#sid"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "local_ip"
            java.lang.String r2 = "#ip"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "successful_requests"
            java.lang.String r2 = "#sre"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "failed_requests"
            java.lang.String r2 = "#fre"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "req_time"
            java.lang.String r2 = "#ret"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "channel"
            java.lang.String r2 = "#chn"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "wrapper_type"
            java.lang.String r2 = "#wt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "wrapper_version"
            java.lang.String r2 = "#wv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "targetSdkVer"
            java.lang.String r2 = "#tsv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "rps_pr"
            java.lang.String r2 = "#rps"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "module_ver"
            java.lang.String r2 = "#mov"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "vertical_type"
            java.lang.String r2 = "#vt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "secret"
            java.lang.String r2 = "#sec"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "pro_ver"
            java.lang.String r2 = "#prv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "$pr_ve"
            java.lang.String r2 = "#$prv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "$ud_da"
            java.lang.String r2 = "#uda"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "devicetoken"
            java.lang.String r2 = "#tok"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "i_sdk_v"
            java.lang.String r2 = "#iv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "access_subtype"
            java.lang.String r2 = "#ast"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "backstate"
            java.lang.String r2 = "#bst"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "zdata_ver"
            java.lang.String r2 = "#zv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "zdata_req_ts"
            java.lang.String r2 = "#zrt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "app_b_v"
            java.lang.String r2 = "#bv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "zdata"
            java.lang.String r2 = "#zta"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "module_tag"
            java.lang.String r2 = "#mt"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "zid_sdk_version"
            java.lang.String r2 = "#zsv"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.String r1 = "others_OS"
            java.lang.String r2 = "#oos"
            r0.put(r1, r2)
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.k = r0
            return
    }

    private int a(android.content.Context r4, com.umeng.commonsdk.statistics.idtracking.Envelope r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r3 = this;
            if (r4 == 0) goto L9b
            if (r5 == 0) goto L9b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lc
            goto L9b
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L16
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r4)
        L16:
            java.lang.String r8 = com.umeng.commonsdk.stateless.d.b(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "&&"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = "_"
            r0.append(r7)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = ".log"
            r0.append(r7)
            byte[] r5 = r5.toBinary()
            boolean r7 = com.umeng.commonsdk.utils.c.a()
            r8 = 122(0x7a, float:1.71E-43)
            java.lang.String r1 = "h"
            if (r7 == 0) goto L5f
            boolean r6 = r6.startsWith(r1)
            if (r6 == 0) goto L5e
            java.lang.String r6 = r0.toString()
            int r4 = com.umeng.commonsdk.framework.UMFrUtils.saveEnvelopeFile(r4, r6, r5)
            return r4
        L5e:
            return r8
        L5f:
            boolean r7 = r6.startsWith(r1)
            if (r7 == 0) goto L66
            return r8
        L66:
            java.lang.String r7 = "z"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L92
            java.lang.String r7 = "i"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L92
            java.lang.String r7 = "a"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L92
            java.lang.String r7 = "t"
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L87
            goto L92
        L87:
            java.lang.String r6 = com.umeng.commonsdk.stateless.a.f
            java.lang.String r7 = r0.toString()
            int r4 = com.umeng.commonsdk.stateless.d.a(r4, r6, r7, r5)
            return r4
        L92:
            java.lang.String r6 = r0.toString()
            int r4 = com.umeng.commonsdk.framework.UMFrUtils.saveEnvelopeFile(r4, r6, r5)
            return r4
        L9b:
            r4 = 101(0x65, float:1.42E-43)
            return r4
    }

    public static long a(android.content.Context r4) {
            long r0 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX
            long r2 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_EXTRA_LENGTH
            long r0 = r0 - r2
            boolean r4 = com.umeng.commonsdk.statistics.common.ULog.DEBUG
            return r0
    }

    private com.umeng.commonsdk.statistics.idtracking.Envelope a(android.content.Context r4, byte[] r5) {
            r3 = this;
            java.lang.String r0 = "codex"
            r1 = 0
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r0, r1)
            r1 = -1
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NumberFormatException -> L17
            if (r2 != 0) goto L1b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L17
            int r1 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L17
            goto L1b
        L17:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r0)
        L1b:
            if (r1 != 0) goto L26
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r4)
            com.umeng.commonsdk.statistics.idtracking.Envelope r4 = com.umeng.commonsdk.statistics.idtracking.Envelope.genEnvelope(r4, r0, r5)
            goto L47
        L26:
            r0 = 1
            if (r1 != r0) goto L32
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r4)
            com.umeng.commonsdk.statistics.idtracking.Envelope r4 = com.umeng.commonsdk.statistics.idtracking.Envelope.genEncryptEnvelope(r4, r0, r5)
            goto L47
        L32:
            boolean r0 = com.umeng.commonsdk.statistics.b.l
            if (r0 == 0) goto L3f
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r4)
            com.umeng.commonsdk.statistics.idtracking.Envelope r4 = com.umeng.commonsdk.statistics.idtracking.Envelope.genEncryptEnvelope(r4, r0, r5)
            goto L47
        L3f:
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r4)
            com.umeng.commonsdk.statistics.idtracking.Envelope r4 = com.umeng.commonsdk.statistics.idtracking.Envelope.genEnvelope(r4, r0, r5)
        L47:
            return r4
    }

    public static java.lang.String a(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.statistics.b.j
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L10:
            return r1
    }

    private org.json.JSONObject a(int r2, org.json.JSONObject r3) {
            r1 = this;
            java.lang.String r0 = "exception"
            if (r3 == 0) goto L8
            r3.put(r0, r2)     // Catch: java.lang.Exception -> L7
        L7:
            return r3
        L8:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r3.put(r0, r2)     // Catch: java.lang.Exception -> L10
        L10:
            return r3
    }

    private static org.json.JSONObject a(android.content.Context r17, java.lang.String r18, boolean r19) {
            r1 = r17
            r2 = r18
            java.lang.String r3 = "umid"
            java.lang.String r0 = "failed_requests"
            java.lang.String r4 = "2G/3G"
            java.lang.String r5 = "Android"
            java.lang.String r6 = "1"
            android.content.SharedPreferences r8 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = com.umeng.commonsdk.statistics.b.i     // Catch: java.lang.Throwable -> L28
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L28
            r11 = 0
            if (r9 != 0) goto L2f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            java.lang.String r5 = com.umeng.commonsdk.statistics.b.i     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2b
            r15 = r8
        L23:
            r13 = 0
            r16 = 1
            goto L316
        L28:
            r0 = move-exception
            goto L600
        L2b:
            r15 = r8
            r4 = 0
            goto L23
        L2f:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "app_signature"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppMD5Signature(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "app_sig_sha1"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppSHA1Key(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "app_sig_sha"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppHashKey(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "app_version"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "version_code"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionCode(r1)     // Catch: java.lang.Throwable -> L28
            int r13 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "idmd5"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceIdUmengMD5(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "cpu"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCPU()     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMCCMNC(r1)     // Catch: java.lang.Throwable -> L28
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r14 = ""
            java.lang.String r15 = "mccmnc"
            if (r13 != 0) goto Lab
            java.lang.String r13 = a(r15)     // Catch: java.lang.Throwable -> L28
            r9.put(r13, r12)     // Catch: java.lang.Throwable -> L28
            com.umeng.commonsdk.statistics.b.b = r12     // Catch: java.lang.Throwable -> L28
            goto Lb2
        Lab:
            java.lang.String r12 = a(r15)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r14)     // Catch: java.lang.Throwable -> L28
        Lb2:
            java.lang.String r12 = "header_sub_os_info"
            boolean r12 = com.umeng.commonsdk.config.FieldManager.allow(r12)     // Catch: java.lang.Throwable -> L28
            if (r12 == 0) goto Le0
            java.lang.String r12 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSName(r1)     // Catch: java.lang.Throwable -> L28
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L28
            if (r13 != 0) goto Lcd
            java.lang.String r13 = "sub_os_name"
            java.lang.String r13 = a(r13)     // Catch: java.lang.Throwable -> L28
            r9.put(r13, r12)     // Catch: java.lang.Throwable -> L28
        Lcd:
            java.lang.String r12 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSVersion(r1)     // Catch: java.lang.Throwable -> L28
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L28
            if (r13 != 0) goto Le0
            java.lang.String r13 = "sub_os_version"
            java.lang.String r13 = a(r13)     // Catch: java.lang.Throwable -> L28
            r9.put(r13, r12)     // Catch: java.lang.Throwable -> L28
        Le0:
            java.lang.String r12 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceType(r1)     // Catch: java.lang.Throwable -> L28
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L28
            if (r13 != 0) goto Lf3
            java.lang.String r13 = "device_type"
            java.lang.String r13 = a(r13)     // Catch: java.lang.Throwable -> L28
            r9.put(r13, r12)     // Catch: java.lang.Throwable -> L28
        Lf3:
            java.lang.String r12 = "package_name"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getPackageName(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "sdk_type"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "device_id"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceId(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "device_model"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "device_board"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = android.os.Build.BOARD     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "device_brand"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r13)     // Catch: java.lang.Throwable -> L28
            java.lang.String r12 = "device_manutime"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L28
            r15 = r8
            r13 = 0
            long r7 = android.os.Build.TIME     // Catch: java.lang.Throwable -> L28
            r9.put(r12, r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "device_manufacturer"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "device_manuid"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = android.os.Build.ID     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "device_name"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "os_version"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "os"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r5)     // Catch: java.lang.Throwable -> L28
            int[] r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getResolutionArray(r1)     // Catch: java.lang.Throwable -> L28
            if (r7 == 0) goto L1a3
            java.lang.String r8 = "resolution"
            java.lang.String r8 = a(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r12.<init>()     // Catch: java.lang.Throwable -> L28
            r16 = 1
            r10 = r7[r16]     // Catch: java.lang.Throwable -> L28
            r12.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "*"
            r12.append(r10)     // Catch: java.lang.Throwable -> L28
            r7 = r7[r11]     // Catch: java.lang.Throwable -> L28
            r12.append(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> L28
            r9.put(r8, r7)     // Catch: java.lang.Throwable -> L28
            goto L1a5
        L1a3:
            r16 = 1
        L1a5:
            java.lang.String r7 = "mc"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "timezone"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            int r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getTimeZone(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getLocaleInfo(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "country"
            java.lang.String r8 = a(r8)     // Catch: java.lang.Throwable -> L28
            r10 = r7[r11]     // Catch: java.lang.Throwable -> L28
            r9.put(r8, r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "language"
            java.lang.String r8 = a(r8)     // Catch: java.lang.Throwable -> L28
            r7 = r7[r16]     // Catch: java.lang.Throwable -> L28
            r9.put(r8, r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "carrier"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkOperatorName(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "display_name"
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "Wi-Fi"
            r10 = r7[r11]     // Catch: java.lang.Throwable -> L28
            boolean r8 = r8.equals(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "access"
            if (r8 == 0) goto L20d
            java.lang.String r4 = a(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "wifi"
            r9.put(r4, r8)     // Catch: java.lang.Throwable -> L28
            goto L226
        L20d:
            r8 = r7[r11]     // Catch: java.lang.Throwable -> L28
            boolean r8 = r4.equals(r8)     // Catch: java.lang.Throwable -> L28
            if (r8 == 0) goto L21d
            java.lang.String r8 = a(r10)     // Catch: java.lang.Throwable -> L28
            r9.put(r8, r4)     // Catch: java.lang.Throwable -> L28
            goto L226
        L21d:
            java.lang.String r4 = a(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "unknow"
            r9.put(r4, r8)     // Catch: java.lang.Throwable -> L28
        L226:
            r4 = r7[r16]     // Catch: java.lang.Throwable -> L28
            boolean r4 = r14.equals(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L239
            java.lang.String r4 = "access_subtype"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            r7 = r7[r16]     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r7)     // Catch: java.lang.Throwable -> L28
        L239:
            boolean r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.isHarmony(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = "others_OS"
            if (r4 == 0) goto L24b
            java.lang.String r4 = a(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "harmony"
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
            goto L252
        L24b:
            java.lang.String r4 = a(r7)     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
        L252:
            java.lang.String r4 = "network_type"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            int r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkType(r1)     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "com_ver"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = "9.6.5"
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "com_type"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            int r5 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "mini_ver"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = com.umeng.commonsdk.statistics.b.a     // Catch: java.lang.Throwable -> L28
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L291
            java.lang.String r4 = "module"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = com.umeng.commonsdk.statistics.b.a     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
        L291:
            java.lang.String r4 = "api_level"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch: java.lang.Throwable -> L28
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2af
            java.lang.String r4 = "urec_ver"
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch: java.lang.Throwable -> L28
            r9.put(r4, r5)     // Catch: java.lang.Throwable -> L28
        L2af:
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getUUIDForZid(r1)     // Catch: java.lang.Throwable -> L2c9
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L2c9
            if (r5 == 0) goto L2c0
            com.umeng.commonsdk.utils.UMUtils.setUUIDForZid(r1)     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getUUIDForZid(r1)     // Catch: java.lang.Throwable -> L2c9
        L2c0:
            java.lang.String r5 = "session_id"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L2c9
            r9.put(r5, r4)     // Catch: java.lang.Throwable -> L2c9
        L2c9:
            java.lang.String r4 = "android.per"
            java.lang.String r5 = "mission.PACK"
            java.lang.String r7 = "AGE_USAGE_"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30f
            r8.<init>()     // Catch: java.lang.Throwable -> L30f
            r8.append(r4)     // Catch: java.lang.Throwable -> L30f
            r8.append(r5)     // Catch: java.lang.Throwable -> L30f
            r8.append(r7)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r4 = "STATS"
            r8.append(r4)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L30f
            boolean r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasRequestPermission(r1, r4)     // Catch: java.lang.Throwable -> L30f
            if (r4 == 0) goto L304
            java.lang.String r4 = "xpus"
            r9.put(r4, r6)     // Catch: java.lang.Throwable -> L30f
            android.content.Context r4 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L30f
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L30f
            boolean r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasOpsPermission(r4)     // Catch: java.lang.Throwable -> L30f
            if (r4 == 0) goto L304
            java.lang.String r4 = "rpus"
            r9.put(r4, r6)     // Catch: java.lang.Throwable -> L30f
        L304:
            boolean r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.isSystemApp(r1)     // Catch: java.lang.Throwable -> L30f
            if (r4 == 0) goto L30f
            java.lang.String r4 = "issys"
            r9.put(r4, r6)     // Catch: java.lang.Throwable -> L30f
        L30f:
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L28
            com.umeng.commonsdk.statistics.b.i = r4     // Catch: java.lang.Throwable -> L28
            r4 = r9
        L316:
            if (r4 != 0) goto L319
            return r13
        L319:
            java.lang.String r5 = "oaid_required_time"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L326
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getOaidRequiredTime(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L326
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L326
        L326:
            java.lang.String r5 = "successful_requests"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            java.lang.String r6 = "successful_request"
            int r6 = r15.getInt(r6, r11)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            java.lang.String r5 = a(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            int r0 = r15.getInt(r0, r11)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            java.lang.String r0 = "req_time"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            java.lang.String r5 = "last_request_spent_ms"
            int r5 = r15.getInt(r5, r11)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getZid(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            if (r5 != 0) goto L362
            java.lang.String r5 = "zid"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
        L362:
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            if (r0 != 0) goto L375
            java.lang.String r0 = "zid_sdk_version"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L375
        L375:
            java.lang.String r0 = "channel"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getChannel(r1)     // Catch: java.lang.Throwable -> L28
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "appkey"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r1)     // Catch: java.lang.Throwable -> L28
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getDeviceToken(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3a3
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3a3
            if (r5 != 0) goto L3a7
            java.lang.String r5 = "devicetoken"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3a3
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3a3
            goto L3a7
        L3a3:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)     // Catch: java.lang.Throwable -> L28
        L3a7:
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r3, r13)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3b9
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3b9
            if (r5 != 0) goto L3bd
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3b9
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3b9
            goto L3bd
        L3b9:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)     // Catch: java.lang.Throwable -> L28
        L3bd:
            java.lang.String r0 = "wrapper_type"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3d3
            java.lang.String r3 = com.umeng.commonsdk.statistics.a.a     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3d3
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3d3
            java.lang.String r0 = "wrapper_version"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3d3
            java.lang.String r3 = com.umeng.commonsdk.statistics.a.b     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3d3
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L3d3
        L3d3:
            int r0 = com.umeng.commonsdk.utils.UMUtils.getTargetSdkVersion(r1)     // Catch: java.lang.Throwable -> L3fd
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r3 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r1, r3)     // Catch: java.lang.Throwable -> L3fd
            java.lang.String r5 = "targetSdkVer"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L3fd
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L3fd
            java.lang.String r0 = "rps_pr"
            if (r3 == 0) goto L3f4
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L3fd
            java.lang.String r3 = "yes"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L3fd
            goto L3fd
        L3f4:
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L3fd
            java.lang.String r3 = "no"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L3fd
        L3fd:
            boolean r0 = b()     // Catch: java.lang.Throwable -> L411
            if (r0 == 0) goto L411
            java.lang.String r0 = "umTaskId"
            java.lang.String r3 = com.umeng.commonsdk.statistics.b.g     // Catch: java.lang.Throwable -> L411
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L411
            java.lang.String r0 = "umCaseId"
            java.lang.String r3 = com.umeng.commonsdk.statistics.b.h     // Catch: java.lang.Throwable -> L411
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L411
        L411:
            java.lang.String r0 = "t"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L421
            java.lang.String r0 = "a"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L455
        L421:
            if (r19 == 0) goto L455
            int[] r0 = b(r1)     // Catch: java.lang.Throwable -> L455
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L455
            r2.<init>()     // Catch: java.lang.Throwable -> L455
            r3 = r0[r11]     // Catch: java.lang.Throwable -> L455
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L455
            r2.append(r3)     // Catch: java.lang.Throwable -> L455
            r3 = r0[r16]     // Catch: java.lang.Throwable -> L455
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L455
            r2.append(r3)     // Catch: java.lang.Throwable -> L455
            r3 = 2
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L455
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L455
            r2.append(r0)     // Catch: java.lang.Throwable -> L455
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L455
            java.lang.String r2 = "policy"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L455
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L455
        L455:
            java.util.Map r0 = com.umeng.commonsdk.statistics.TagHelper.getModuleTags()     // Catch: java.lang.Throwable -> L493
            if (r0 == 0) goto L493
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L493
            if (r2 <= 0) goto L493
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L493
            r2.<init>()     // Catch: java.lang.Throwable -> L493
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L493
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L493
        L46e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L493
            if (r3 == 0) goto L48a
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L493
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L493
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L493
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L493
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L493
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L493
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L493
            goto L46e
        L48a:
            java.lang.String r0 = "module_tag"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L493
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L493
        L493:
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.getRealTimeDebugKey()     // Catch: java.lang.Throwable -> L4a6
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4a6
            if (r2 != 0) goto L4a6
            java.lang.String r2 = "dk"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L4a6
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L4a6
        L4a6:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b6
            r0.<init>()     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r2 = "i_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = "1.2.0"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L4c9
            java.lang.String r2 = "a_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L4c9:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L4dc
            java.lang.String r2 = "g_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L4dc:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L4ef
            java.lang.String r2 = "p_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L4ef:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L502
            java.lang.String r2 = "s_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L502:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L515
            java.lang.String r2 = "c_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L515:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L528
            java.lang.String r2 = "n_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L528:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L53b
            java.lang.String r2 = "m_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L53b:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L54e
            java.lang.String r2 = "u_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L54e:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L561
            java.lang.String r2 = "v_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L561:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L574
            java.lang.String r2 = "z_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L574:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L587
            java.lang.String r2 = "l_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L587:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L59a
            java.lang.String r2 = "t_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L59a:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANTI_VERSION     // Catch: java.lang.Throwable -> L5b6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5b6
            if (r2 != 0) goto L5ad
            java.lang.String r2 = "r_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANTI_VERSION     // Catch: java.lang.Throwable -> L5b6
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L5b6
        L5ad:
            java.lang.String r2 = "module_ver"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5b6
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L5b6
        L5b6:
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getApmFlag()     // Catch: java.lang.Throwable -> L5c9
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5c9
            if (r2 != 0) goto L5c9
            java.lang.String r2 = "_$apmflag"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L5c9
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L5c9
        L5c9:
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r1)     // Catch: java.lang.Throwable -> L28
            byte[] r0 = r0.a()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L5e8
            int r2 = r0.length     // Catch: java.lang.Throwable -> L28
            if (r2 <= 0) goto L5e8
            java.lang.String r2 = "imprint"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L5e4
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L5e4
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L5e4
            goto L5e8
        L5e4:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)     // Catch: java.lang.Throwable -> L28
        L5e8:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L28
            if (r0 <= 0) goto L5fe
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "header"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L28
            org.json.JSONObject r0 = r0.put(r2, r4)     // Catch: java.lang.Throwable -> L28
            return r0
        L5fe:
            r13 = 0
            goto L604
        L600:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
            goto L5fe
        L604:
            return r13
    }

    private org.json.JSONObject a(org.json.JSONObject r5, org.json.JSONObject r6) {
            r4 = this;
            if (r5 == 0) goto L6c
            if (r6 == 0) goto L6c
            java.lang.String r0 = "header"
            java.lang.String r1 = a(r0)
            java.lang.Object r1 = r5.opt(r1)
            if (r1 == 0) goto L6c
            java.lang.String r1 = a(r0)
            java.lang.Object r1 = r5.opt(r1)
            boolean r1 = r1 instanceof org.json.JSONObject
            if (r1 == 0) goto L6c
            java.lang.String r0 = a(r0)
            java.lang.Object r0 = r5.opt(r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.util.Iterator r1 = r6.keys()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r1.next()
            if (r2 == 0) goto L2a
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L2a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.opt(r2)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r6.opt(r2)     // Catch: java.lang.Exception -> L6a
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = "vertical_type"
            java.lang.String r3 = a(r3)     // Catch: java.lang.Exception -> L6a
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r6.opt(r2)     // Catch: java.lang.Exception -> L6a
            boolean r3 = r3 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L2a
            java.lang.Object r2 = r6.opt(r2)     // Catch: java.lang.Exception -> L6a
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L6a
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L6a
            r4.k = r2     // Catch: java.lang.Exception -> L6a
            goto L2a
        L6a:
            goto L2a
        L6c:
            return r5
    }

    public static void a() {
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.i
            if (r0 == 0) goto La
            r0 = 0
            com.umeng.commonsdk.statistics.b.i = r0
            com.umeng.commonsdk.statistics.idtracking.e.a()
        La:
            return
    }

    public static void a(boolean r0) {
            com.umeng.commonsdk.statistics.b.l = r0
            return
    }

    private static boolean b() {
            java.lang.String r0 = "debug.umeng.umTaskId"
            java.lang.String r1 = ""
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getSystemProperty(r0, r1)
            com.umeng.commonsdk.statistics.b.g = r0
            java.lang.String r0 = "debug.umeng.umCaseId"
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getSystemProperty(r0, r1)
            com.umeng.commonsdk.statistics.b.h = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "empty"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L28
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.g
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            java.lang.String r4 = com.umeng.commonsdk.statistics.b.h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3b
            java.lang.String r4 = com.umeng.commonsdk.statistics.b.h
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L3b
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r0 == 0) goto L41
            if (r1 == 0) goto L41
            return r2
        L41:
            return r3
    }

    private static int[] b(android.content.Context r4) {
            r0 = 3
            int[] r0 = new int[r0]
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2e
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = com.umeng.commonsdk.internal.c.a     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2e
            java.lang.String r1 = "preInitInvokedFlag"
            int r1 = r4.getInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r0[r2] = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "policyGrantInvokedFlag"
            int r1 = r4.getInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            r0[r3] = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "policyGrantResult"
            int r4 = r4.getInt(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r1 = 2
            r0[r1] = r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            return r0
    }

    public org.json.JSONObject a(android.content.Context r9, org.json.JSONObject r10, org.json.JSONObject r11, java.lang.String r12) {
            r8 = this;
            java.lang.String r0 = "serial"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld1
            r1.<init>()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = "header"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> Ld1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld1
            r3.<init>()     // Catch: java.lang.Throwable -> Ld1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto L22
            org.json.JSONObject r1 = r8.a(r1, r10)     // Catch: java.lang.Throwable -> L1c
            goto L22
        L1c:
            r0 = move-exception
            r10 = r0
            r2 = r8
            r3 = r9
            goto Ld5
        L22:
            if (r1 == 0) goto L4a
            if (r11 == 0) goto L4a
            java.util.Iterator r10 = r11.keys()     // Catch: java.lang.Throwable -> L1c
        L2a:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L2a
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r11.opt(r2)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r11.opt(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L2a
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L2a
            goto L2a
        L4a:
            java.lang.String r5 = "h==1.2.0"
            if (r1 == 0) goto L7e
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L1c
            int r10 = r10.length     // Catch: java.lang.Throwable -> L1c
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L1c
            long r2 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX     // Catch: java.lang.Throwable -> L1c
            boolean r10 = com.umeng.commonsdk.statistics.common.DataHelper.largeThanMaxSize(r10, r2)     // Catch: java.lang.Throwable -> L1c
            if (r10 == 0) goto L7e
            android.content.SharedPreferences r10 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r9)     // Catch: java.lang.Throwable -> L1c
            if (r10 == 0) goto L77
            r11 = 1
            int r12 = r10.getInt(r0, r11)     // Catch: java.lang.Throwable -> L1c
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L1c
            int r12 = r12 + r11
            android.content.SharedPreferences$Editor r10 = r10.putInt(r0, r12)     // Catch: java.lang.Throwable -> L1c
            r10.commit()     // Catch: java.lang.Throwable -> L1c
        L77:
            r10 = 113(0x71, float:1.58E-43)
            org.json.JSONObject r9 = r8.a(r10, r1)     // Catch: java.lang.Throwable -> L1c
            return r9
        L7e:
            if (r1 == 0) goto L97
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L1c
            com.umeng.commonsdk.statistics.idtracking.Envelope r10 = r8.a(r9, r10)     // Catch: java.lang.Throwable -> L1c
            if (r10 != 0) goto L95
            r10 = 111(0x6f, float:1.56E-43)
            org.json.JSONObject r9 = r8.a(r10, r1)     // Catch: java.lang.Throwable -> L1c
            return r9
        L95:
            r4 = r10
            goto L99
        L97:
            r10 = 0
            goto L95
        L99:
            if (r4 == 0) goto Lb0
            byte[] r10 = r4.toBinary()     // Catch: java.lang.Throwable -> L1c
            int r10 = r10.length     // Catch: java.lang.Throwable -> L1c
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L1c
            long r2 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_LENGTH_MAX     // Catch: java.lang.Throwable -> L1c
            boolean r10 = com.umeng.commonsdk.statistics.common.DataHelper.largeThanMaxSize(r10, r2)     // Catch: java.lang.Throwable -> L1c
            if (r10 == 0) goto Lb0
            r10 = 114(0x72, float:1.6E-43)
            org.json.JSONObject r9 = r8.a(r10, r1)     // Catch: java.lang.Throwable -> L1c
            return r9
        Lb0:
            java.lang.String r6 = ""
            r2 = r8
            r3 = r9
            r7 = r12
            int r9 = r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lc0
            if (r9 == 0) goto Lc3
            org.json.JSONObject r9 = r8.a(r9, r1)     // Catch: java.lang.Throwable -> Lc0
            return r9
        Lc0:
            r0 = move-exception
        Lc1:
            r10 = r0
            goto Ld5
        Lc3:
            boolean r9 = com.umeng.commonsdk.statistics.common.ULog.DEBUG     // Catch: java.lang.Throwable -> Lc0
            if (r9 == 0) goto Ld0
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Lc0
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> Lc0
            int r9 = r9.length     // Catch: java.lang.Throwable -> Lc0
        Ld0:
            return r1
        Ld1:
            r0 = move-exception
            r2 = r8
            r3 = r9
            goto Lc1
        Ld5:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r10)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r10 = 110(0x6e, float:1.54E-43)
            org.json.JSONObject r9 = r8.a(r10, r9)
            return r9
    }

    public org.json.JSONObject a(android.content.Context r17, org.json.JSONObject r18, org.json.JSONObject r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            r16 = this;
            r1 = r16
            r2 = r17
            r7 = r18
            r8 = r19
            java.lang.String r0 = "serial"
            java.lang.String r3 = "&="
            java.lang.String r4 = "analytics"
            java.lang.String r9 = "header"
            boolean r5 = com.umeng.commonsdk.statistics.common.ULog.DEBUG
            if (r5 == 0) goto L2a
            if (r7 == 0) goto L2a
            if (r8 == 0) goto L2a
            java.lang.String r5 = r7.toString()
            byte[] r5 = r5.getBytes()
            int r5 = r5.length
            java.lang.String r5 = r8.toString()
            byte[] r5 = r5.getBytes()
            int r5 = r5.length
        L2a:
            r10 = 110(0x6e, float:1.54E-43)
            if (r2 == 0) goto L30
            if (r8 != 0) goto L33
        L30:
            r2 = 0
            goto L224
        L33:
            boolean r5 = r8.has(r4)     // Catch: java.lang.Throwable -> L4d
            r6 = 1
            r12 = 0
            if (r5 == 0) goto L50
            org.json.JSONObject r4 = r8.optJSONObject(r4)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L50
            java.lang.String r5 = "sessions"
            boolean r4 = r4.has(r5)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L50
            r5 = 1
        L4a:
            r4 = r21
            goto L52
        L4d:
            r0 = move-exception
            goto L1d5
        L50:
            r5 = 0
            goto L4a
        L52:
            org.json.JSONObject r5 = a(r2, r4, r5)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L5e
            if (r7 == 0) goto L5e
            org.json.JSONObject r5 = r1.a(r5, r7)     // Catch: java.lang.Throwable -> L4d
        L5e:
            r13 = r5
            if (r13 == 0) goto L89
            java.util.Iterator r5 = r8.keys()     // Catch: java.lang.Throwable -> L4d
        L65:
            boolean r14 = r5.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r14 == 0) goto L89
            java.lang.Object r14 = r5.next()     // Catch: java.lang.Throwable -> L4d
            if (r14 == 0) goto L65
            boolean r15 = r14 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4d
            if (r15 == 0) goto L65
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r15 = r8.opt(r14)     // Catch: java.lang.Throwable -> L4d
            if (r15 == 0) goto L65
            java.lang.String r15 = a(r14)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L65
            java.lang.Object r14 = r8.opt(r14)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L65
            r13.put(r15, r14)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L65
            goto L65
        L89:
            java.lang.String r5 = "u"
            java.lang.String r14 = "1.0.0"
            boolean r15 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4d
            if (r15 != 0) goto L94
            goto L95
        L94:
            r4 = r5
        L95:
            boolean r5 = android.text.TextUtils.isEmpty(r22)     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L9d
            r14 = r22
        L9d:
            if (r13 == 0) goto Ld4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4d
            r5.append(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "=="
            r5.append(r4)     // Catch: java.lang.Throwable -> L4d
            r5.append(r14)     // Catch: java.lang.Throwable -> L4d
            r5.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4d
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto Lc3
            r0 = 101(0x65, float:1.42E-43)
            org.json.JSONObject r0 = r1.a(r0, r13)     // Catch: java.lang.Throwable -> L4d
            return r0
        Lc3:
            boolean r3 = r4.endsWith(r3)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto Ld5
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L4d
            int r3 = r3 + (-2)
            java.lang.String r4 = r4.substring(r12, r3)     // Catch: java.lang.Throwable -> L4d
            goto Ld5
        Ld4:
            r4 = 0
        Ld5:
            if (r13 == 0) goto L111
            com.umeng.commonsdk.statistics.idtracking.e r3 = com.umeng.commonsdk.statistics.idtracking.e.a(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            if (r3 == 0) goto L111
            r3.b()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            com.umeng.commonsdk.statistics.proto.c r3 = r3.c()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            com.umeng.analytics.pro.ca r5 = new com.umeng.analytics.pro.ca     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            r5.<init>()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            byte[] r3 = r5.a(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r12)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            if (r5 != 0) goto L111
            java.lang.String r5 = a(r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            org.json.JSONObject r5 = r13.getJSONObject(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            java.lang.String r12 = "id_tracking"
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            r5.put(r12, r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            java.lang.String r3 = a(r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            r13.put(r3, r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L110
            goto L111
        L110:
        L111:
            if (r13 == 0) goto L142
            java.lang.String r3 = r13.toString()     // Catch: java.lang.Throwable -> L4d
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L4d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L4d
            long r14 = (long) r3     // Catch: java.lang.Throwable -> L4d
            long r11 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX     // Catch: java.lang.Throwable -> L4d
            boolean r3 = com.umeng.commonsdk.statistics.common.DataHelper.largeThanMaxSize(r14, r11)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L142
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r2)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L13b
            int r4 = r3.getInt(r0, r6)     // Catch: java.lang.Throwable -> L4d
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + r6
            android.content.SharedPreferences$Editor r0 = r3.putInt(r0, r4)     // Catch: java.lang.Throwable -> L4d
            r0.commit()     // Catch: java.lang.Throwable -> L4d
        L13b:
            r0 = 113(0x71, float:1.58E-43)
            org.json.JSONObject r0 = r1.a(r0, r13)     // Catch: java.lang.Throwable -> L4d
            return r0
        L142:
            if (r13 == 0) goto L15b
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L4d
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L4d
            com.umeng.commonsdk.statistics.idtracking.Envelope r0 = r1.a(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L159
            r0 = 111(0x6f, float:1.56E-43)
            org.json.JSONObject r0 = r1.a(r0, r13)     // Catch: java.lang.Throwable -> L4d
            return r0
        L159:
            r3 = r0
            goto L15c
        L15b:
            r3 = 0
        L15c:
            if (r3 == 0) goto L173
            byte[] r0 = r3.toBinary()     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4d
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L4d
            long r11 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_LENGTH_MAX     // Catch: java.lang.Throwable -> L4d
            boolean r0 = com.umeng.commonsdk.statistics.common.DataHelper.largeThanMaxSize(r5, r11)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L173
            r0 = 114(0x72, float:1.6E-43)
            org.json.JSONObject r0 = r1.a(r0, r13)     // Catch: java.lang.Throwable -> L4d
            return r0
        L173:
            if (r13 == 0) goto L18b
            java.lang.String r0 = a(r9)     // Catch: java.lang.Throwable -> L4d
            org.json.JSONObject r0 = r13.optJSONObject(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "app_version"
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.optString(r5)     // Catch: java.lang.Throwable -> L4d
            r5 = r0
        L188:
            r6 = r20
            goto L18d
        L18b:
            r5 = 0
            goto L188
        L18d:
            int r0 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L198
            org.json.JSONObject r0 = r1.a(r0, r13)     // Catch: java.lang.Throwable -> L4d
            return r0
        L198:
            boolean r0 = com.umeng.commonsdk.statistics.common.ULog.DEBUG     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L1a5
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L4d
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4d
        L1a5:
            java.lang.String r0 = "z"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1d4
            java.lang.String r0 = "i"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1d4
            java.lang.String r0 = "t"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1d4
            java.lang.String r0 = "a"
            boolean r0 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L1c6
            goto L1d4
        L1c6:
            boolean r0 = com.umeng.commonsdk.stateless.b.a()     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1d4
            com.umeng.commonsdk.stateless.b r0 = new com.umeng.commonsdk.stateless.b     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            com.umeng.commonsdk.stateless.b.b()     // Catch: java.lang.Throwable -> L4d
        L1d4:
            return r13
        L1d5:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r0)
            if (r7 == 0) goto L1ec
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1e9
            r3.<init>()     // Catch: java.lang.Exception -> L1e9
            r3.put(r9, r7)     // Catch: java.lang.Exception -> L1e3 org.json.JSONException -> L1e6
            goto L1e7
        L1e3:
            r0 = move-exception
            r11 = r3
            goto L21c
        L1e6:
        L1e7:
            r11 = r3
            goto L1ed
        L1e9:
            r0 = move-exception
            r11 = 0
            goto L21c
        L1ec:
            r11 = 0
        L1ed:
            if (r11 != 0) goto L1f8
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1f6
            r0.<init>()     // Catch: java.lang.Exception -> L1f6
            r11 = r0
            goto L1f8
        L1f6:
            r0 = move-exception
            goto L21c
        L1f8:
            java.util.Iterator r0 = r8.keys()     // Catch: java.lang.Exception -> L1f6
        L1fc:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L1f6
            if (r3 == 0) goto L21f
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L1f6
            if (r3 == 0) goto L1fc
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> L1f6
            if (r4 == 0) goto L1fc
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1f6
            java.lang.Object r4 = r8.opt(r3)     // Catch: java.lang.Exception -> L1f6
            if (r4 == 0) goto L1fc
            java.lang.Object r4 = r8.opt(r3)     // Catch: java.lang.Exception -> L1fc
            r11.put(r3, r4)     // Catch: java.lang.Exception -> L1fc
            goto L1fc
        L21c:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r0)
        L21f:
            org.json.JSONObject r0 = r1.a(r10, r11)
            return r0
        L224:
            org.json.JSONObject r0 = r1.a(r10, r2)
            return r0
    }

    public org.json.JSONObject b(android.content.Context r9, org.json.JSONObject r10, org.json.JSONObject r11, java.lang.String r12) {
            r8 = this;
            java.lang.String r0 = "serial"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le9
            r1.<init>()     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = "header"
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> Le9
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le9
            r3.<init>()     // Catch: java.lang.Throwable -> Le9
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Le9
            boolean r2 = b()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2b
            java.lang.String r2 = "umTaskId"
            java.lang.String r3 = com.umeng.commonsdk.statistics.b.g     // Catch: java.lang.Throwable -> L2a
            r10.put(r2, r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "umCaseId"
            java.lang.String r3 = com.umeng.commonsdk.statistics.b.h     // Catch: java.lang.Throwable -> L2a
            r10.put(r2, r3)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
        L2b:
            if (r10 == 0) goto L38
            org.json.JSONObject r1 = r8.a(r1, r10)     // Catch: java.lang.Throwable -> L32
            goto L38
        L32:
            r0 = move-exception
            r10 = r0
            r2 = r8
            r3 = r9
            goto Led
        L38:
            if (r1 == 0) goto L60
            if (r11 == 0) goto L60
            java.util.Iterator r10 = r11.keys()     // Catch: java.lang.Throwable -> L32
        L40:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L60
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L40
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L40
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r11.opt(r2)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L40
            java.lang.Object r3 = r11.opt(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L40
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L40
            goto L40
        L60:
            java.lang.String r5 = "z==1.2.0"
            if (r1 == 0) goto L94
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L32
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L32
            int r10 = r10.length     // Catch: java.lang.Throwable -> L32
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L32
            long r2 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX     // Catch: java.lang.Throwable -> L32
            boolean r10 = com.umeng.commonsdk.statistics.common.DataHelper.largeThanMaxSize(r10, r2)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L94
            android.content.SharedPreferences r10 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r9)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L8d
            r11 = 1
            int r12 = r10.getInt(r0, r11)     // Catch: java.lang.Throwable -> L32
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L32
            int r12 = r12 + r11
            android.content.SharedPreferences$Editor r10 = r10.putInt(r0, r12)     // Catch: java.lang.Throwable -> L32
            r10.commit()     // Catch: java.lang.Throwable -> L32
        L8d:
            r10 = 113(0x71, float:1.58E-43)
            org.json.JSONObject r9 = r8.a(r10, r1)     // Catch: java.lang.Throwable -> L32
            return r9
        L94:
            if (r1 == 0) goto Lad
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L32
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L32
            com.umeng.commonsdk.statistics.idtracking.Envelope r10 = r8.a(r9, r10)     // Catch: java.lang.Throwable -> L32
            if (r10 != 0) goto Lab
            r10 = 111(0x6f, float:1.56E-43)
            org.json.JSONObject r9 = r8.a(r10, r1)     // Catch: java.lang.Throwable -> L32
            return r9
        Lab:
            r4 = r10
            goto Laf
        Lad:
            r10 = 0
            goto Lab
        Laf:
            if (r4 == 0) goto Lc6
            byte[] r10 = r4.toBinary()     // Catch: java.lang.Throwable -> L32
            int r10 = r10.length     // Catch: java.lang.Throwable -> L32
            long r10 = (long) r10     // Catch: java.lang.Throwable -> L32
            long r2 = com.umeng.commonsdk.statistics.common.DataHelper.ENVELOPE_LENGTH_MAX     // Catch: java.lang.Throwable -> L32
            boolean r10 = com.umeng.commonsdk.statistics.common.DataHelper.largeThanMaxSize(r10, r2)     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lc6
            r10 = 114(0x72, float:1.6E-43)
            org.json.JSONObject r9 = r8.a(r10, r1)     // Catch: java.lang.Throwable -> L32
            return r9
        Lc6:
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r9)     // Catch: java.lang.Throwable -> Le9
            r2 = r8
            r3 = r9
            r7 = r12
            int r9 = r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Ld8
            if (r9 == 0) goto Ldb
            org.json.JSONObject r9 = r8.a(r9, r1)     // Catch: java.lang.Throwable -> Ld8
            return r9
        Ld8:
            r0 = move-exception
        Ld9:
            r10 = r0
            goto Led
        Ldb:
            boolean r9 = com.umeng.commonsdk.statistics.common.ULog.DEBUG     // Catch: java.lang.Throwable -> Ld8
            if (r9 == 0) goto Le8
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Ld8
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> Ld8
            int r9 = r9.length     // Catch: java.lang.Throwable -> Ld8
        Le8:
            return r1
        Le9:
            r0 = move-exception
            r2 = r8
            r3 = r9
            goto Ld9
        Led:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r10)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r10 = 110(0x6e, float:1.54E-43)
            org.json.JSONObject r9 = r8.a(r10, r9)
            return r9
    }
}
