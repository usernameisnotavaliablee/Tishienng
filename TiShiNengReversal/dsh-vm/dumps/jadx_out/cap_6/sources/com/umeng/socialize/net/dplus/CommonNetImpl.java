package com.umeng.socialize.net.dplus;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CommonNetImpl implements com.umeng.commonsdk.framework.UMLogDataProtocol {
    public static final java.lang.String AID = "aid";
    public static final java.lang.String AM = "am";
    public static final java.lang.String AS = "as";
    public static final java.lang.String AT = "at";
    public static final java.lang.String AUTH = "auth";
    public static final java.lang.String A_B = "a_b";
    public static final java.lang.String CANCEL = "cancel";
    public static final java.lang.String CONTENT = "content";
    public static final java.lang.String CT = "ct";
    public static final java.lang.String DAU = "dau";
    public static final java.lang.String DURL = "durl";
    public static final java.lang.String E_M = "e_m";
    public static final java.lang.String FAIL = "fail";
    public static final int FLAG_AUTH = 268435456;
    public static final int FLAG_SHARE = 536870912;
    public static final int FLAG_SHARE_EDIT = 16777216;
    public static final int FLAG_SHARE_JUMP = 33554432;
    public static final java.lang.String HEADER = "header";
    public static final java.lang.String IMEI = "imei";
    public static final int MAX_FILE_SIZE_IN_KB = 65536;
    public static final int MAX_SEND_SIZE_IN_KB = 524288;
    public static final int MAX_SIZE_IN_KB = 5242880;
    public static final java.lang.String MENUBG = "menubg";
    public static final java.lang.String MOB_NUM = "pn";
    public static final java.lang.String M_P = "m_p";
    public static final java.lang.String M_U = "m_u";
    public static final java.lang.String NAME = "name";
    public static final java.lang.String PCV = "s_pcv";
    public static final java.lang.String PF = "pf";
    public static final java.lang.String PIC = "pic";
    public static final java.lang.String PICURL = "picurl";
    public static final java.lang.String POSITION = "position";
    public static final java.lang.String REGION = "regn";
    public static final java.lang.String RESULT = "result";
    public static final java.lang.String SDKT = "sdkt";
    public static final java.lang.String SDKVERSON = "s_sdk_v";
    public static final java.lang.String SEX = "sex";
    public static final java.lang.String SHARE = "share";
    public static final java.lang.String SHARETYPE = "s_t";
    public static final java.lang.String SM = "sm";
    public static final java.lang.String STATS = "stats";
    public static final java.lang.String STATS_TAG = "stats";
    public static final java.lang.String STYPE = "stype";
    public static final java.lang.String SUCCESS = "success";
    public static final java.lang.String S_A_E = "s_a_e";
    public static final java.lang.String S_A_S = "s_a_s";
    public static final java.lang.String S_DAU = "s_dau";
    public static final java.lang.String S_E = "s_e";
    public static final java.lang.String S_I = "s_i";
    public static final java.lang.String S_I_E = "s_i_e";
    public static final java.lang.String S_I_S = "s_i_s";
    public static final java.lang.String S_S_E = "s_s_e";
    public static final java.lang.String S_S_S = "s_s_s";
    public static final java.lang.String TAG = "tag";
    public static final java.lang.String TITLE = "title";
    public static final java.lang.String TS = "ts";
    public static final java.lang.String UID = "uid";
    public static final java.lang.String UMID = "umid";
    public static final java.lang.String UN = "un";
    public static final java.lang.String UNIONID = "unionid";
    public static final java.lang.String UP = "up";
    public static final java.lang.String URL = "url";
    public static final java.lang.String USERINFO = "userinfo";
    public static final java.lang.String U_C = "u_c";
    public static final java.lang.String click_key = "at";
    private static boolean isSendStats;
    private static com.umeng.socialize.net.dplus.CommonNetImpl singleton;
    private final int MAX_SIZE;
    private java.util.ArrayList<java.lang.Integer> authList;
    private java.util.ArrayList<java.lang.Integer> dauList;
    private java.util.ArrayList<java.lang.Integer> infoList;
    private android.content.Context mConetxt;
    private java.util.ArrayList<java.lang.Integer> shareList;
    private java.util.ArrayList<java.lang.Integer> statsList;

    static {
            return
    }

    private CommonNetImpl(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1.MAX_SIZE = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.shareList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.authList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.infoList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.dauList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.statsList = r0
            r1.mConetxt = r2
            return
    }

    private static double checkFile() {
            java.lang.String r0 = "share.db"
            java.io.File r0 = com.umeng.socialize.utils.ContextUtil.getDataFile(r0)
            r1 = 0
            if (r0 == 0) goto L16
            boolean r3 = r0.exists()
            if (r3 == 0) goto L16
            long r0 = r0.length()
            double r0 = (double) r0
            return r0
        L16:
            return r1
    }

    private void clearAllList() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.shareList
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = r1.authList
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = r1.infoList
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = r1.dauList
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = r1.statsList
            r0.clear()
            return
    }

    private org.json.JSONObject constructHeader() {
            r3 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "s_sdk_v"
            java.lang.String r2 = "7.3.2"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "s_pcv"
            java.lang.String r2 = "3.0"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r0 = r1
        L16:
            return r0
    }

    public static com.umeng.socialize.net.dplus.CommonNetImpl get(android.content.Context r1) {
            com.umeng.socialize.net.dplus.CommonNetImpl r0 = com.umeng.socialize.net.dplus.CommonNetImpl.singleton
            if (r0 != 0) goto Lb
            com.umeng.socialize.net.dplus.CommonNetImpl r0 = new com.umeng.socialize.net.dplus.CommonNetImpl
            r0.<init>(r1)
            com.umeng.socialize.net.dplus.CommonNetImpl.singleton = r0
        Lb:
            com.umeng.socialize.net.dplus.CommonNetImpl r1 = com.umeng.socialize.net.dplus.CommonNetImpl.singleton
            return r1
    }

    private void saveFile(java.lang.Object r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L4
            goto L76
        L4:
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L76
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r0 = "MobclickRT"
            switch(r3) {
                case 24577: goto L5a;
                case 24578: goto L4b;
                case 24579: goto L3c;
                case 24580: goto L2d;
                case 24581: goto L1e;
                case 24582: goto Lf;
                case 24583: goto L1e;
                default: goto Lf;
            }
        Lf:
            java.lang.String r3 = "--->>> Share: default case."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            android.content.Context r3 = r1.mConetxt
            com.umeng.socialize.net.dplus.db.DBManager r3 = com.umeng.socialize.net.dplus.db.DBManager.get(r3)
            r3.insertStats(r2)
            goto L68
        L1e:
            java.lang.String r3 = "--->>> Share: SAVE_STATS_EVENT"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            android.content.Context r3 = r1.mConetxt
            com.umeng.socialize.net.dplus.db.DBManager r3 = com.umeng.socialize.net.dplus.db.DBManager.get(r3)
            r3.insertStats(r2)
            goto L68
        L2d:
            java.lang.String r3 = "--->>> Share: GET_EVENT"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            android.content.Context r3 = r1.mConetxt
            com.umeng.socialize.net.dplus.db.DBManager r3 = com.umeng.socialize.net.dplus.db.DBManager.get(r3)
            r3.insertUserInfo(r2)
            goto L68
        L3c:
            java.lang.String r3 = "--->>> Share: AUTH_EVENT"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            android.content.Context r3 = r1.mConetxt
            com.umeng.socialize.net.dplus.db.DBManager r3 = com.umeng.socialize.net.dplus.db.DBManager.get(r3)
            r3.insertAuth(r2)
            goto L68
        L4b:
            java.lang.String r3 = "--->>> Share: SHARE_EVENT"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            android.content.Context r3 = r1.mConetxt
            com.umeng.socialize.net.dplus.db.DBManager r3 = com.umeng.socialize.net.dplus.db.DBManager.get(r3)
            r3.insertS_E(r2)
            goto L68
        L5a:
            java.lang.String r3 = "--->>> Share: DAU_EVENT"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            android.content.Context r3 = r1.mConetxt
            com.umeng.socialize.net.dplus.db.DBManager r3 = com.umeng.socialize.net.dplus.db.DBManager.get(r3)
            r3.insertDau(r2)
        L68:
            r2 = 24593(0x6011, float:3.4462E-41)
            boolean r3 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist(r2)
            if (r3 != 0) goto L76
            android.content.Context r3 = r1.mConetxt
            r0 = 0
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r2, r1, r0)
        L76:
            return
    }

    public void deleteData(android.content.Context r4) {
            r3 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r3.shareList
            int r0 = r0.size()
            if (r0 <= 0) goto L18
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.shareList
            java.lang.String r2 = "s_e"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.shareList
            r0.clear()
        L18:
            java.util.ArrayList<java.lang.Integer> r0 = r3.authList
            int r0 = r0.size()
            if (r0 <= 0) goto L30
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.authList
            java.lang.String r2 = "auth"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.authList
            r0.clear()
        L30:
            java.util.ArrayList<java.lang.Integer> r0 = r3.dauList
            int r0 = r0.size()
            if (r0 <= 0) goto L48
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.dauList
            java.lang.String r2 = "dau"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.dauList
            r0.clear()
        L48:
            java.util.ArrayList<java.lang.Integer> r0 = r3.infoList
            int r0 = r0.size()
            if (r0 <= 0) goto L60
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r1 = r3.infoList
            java.lang.String r2 = "userinfo"
            r0.delete(r1, r2)
            java.util.ArrayList<java.lang.Integer> r0 = r3.infoList
            r0.clear()
        L60:
            java.util.ArrayList<java.lang.Integer> r0 = r3.statsList
            int r0 = r0.size()
            if (r0 <= 0) goto L78
            com.umeng.socialize.net.dplus.db.DBManager r4 = com.umeng.socialize.net.dplus.db.DBManager.get(r4)
            java.util.ArrayList<java.lang.Integer> r0 = r3.statsList
            java.lang.String r1 = "stats"
            r4.delete(r0, r1)
            java.util.ArrayList<java.lang.Integer> r4 = r3.statsList
            r4.clear()
        L78:
            return
    }

    public org.json.JSONObject readData(android.content.Context r21, int r22) {
            r20 = this;
            r1 = r20
            java.lang.String r0 = "pn"
            double r2 = checkFile()
            r4 = 4707387510509010944(0x4154000000000000, double:5242880.0)
            java.lang.String r6 = "stats"
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L1d
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            com.umeng.socialize.net.dplus.db.DBManager r0 = com.umeng.socialize.net.dplus.db.DBManager.get(r0)
            r0.deleteTable(r6)
            return r7
        L1d:
            r4 = 4672484613396889600(0x40d8000000000000, double:24576.0)
            double r2 = r2 + r4
            r4 = 0
            r8 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L29
            r15 = 0
            goto L2b
        L29:
            r2 = 1
            r15 = 1
        L2b:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le4
            r3.<init>()     // Catch: org.json.JSONException -> Le4
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le4
            r3.<init>()     // Catch: org.json.JSONException -> Le4
            com.umeng.socialize.net.dplus.db.DBManager r10 = com.umeng.socialize.net.dplus.db.DBManager.get(r21)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = "s_e"
            java.util.ArrayList<java.lang.Integer> r12 = r1.shareList     // Catch: org.json.JSONException -> Le4
            r13 = 4697245615254405120(0x412ff80000000000, double:1047552.0)
            org.json.JSONArray r5 = r10.select(r11, r12, r13, r15)     // Catch: org.json.JSONException -> Le4
            java.lang.String r10 = r5.toString()     // Catch: org.json.JSONException -> Le4
            byte[] r10 = r10.getBytes()     // Catch: org.json.JSONException -> Le4
            int r10 = r10.length     // Catch: org.json.JSONException -> Le4
            double r10 = (double) r10     // Catch: org.json.JSONException -> Le4
            r12 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r16 = r10 + r12
            com.umeng.socialize.net.dplus.db.DBManager r10 = com.umeng.socialize.net.dplus.db.DBManager.get(r21)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = "auth"
            java.util.ArrayList<java.lang.Integer> r12 = r1.authList     // Catch: org.json.JSONException -> Le4
            double r13 = r8 - r16
            org.json.JSONArray r10 = r10.select(r11, r12, r13, r15)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = r10.toString()     // Catch: org.json.JSONException -> Le4
            byte[] r11 = r11.getBytes()     // Catch: org.json.JSONException -> Le4
            int r11 = r11.length     // Catch: org.json.JSONException -> Le4
            double r11 = (double) r11     // Catch: org.json.JSONException -> Le4
            double r16 = r16 + r11
            r11 = r10
            com.umeng.socialize.net.dplus.db.DBManager r10 = com.umeng.socialize.net.dplus.db.DBManager.get(r21)     // Catch: org.json.JSONException -> Le4
            r12 = r11
            java.lang.String r11 = "userinfo"
            r13 = r12
            java.util.ArrayList<java.lang.Integer> r12 = r1.infoList     // Catch: org.json.JSONException -> Le4
            r18 = r13
            double r13 = r8 - r16
            r22 = r18
            org.json.JSONArray r10 = r10.select(r11, r12, r13, r15)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = r10.toString()     // Catch: org.json.JSONException -> Le4
            byte[] r11 = r11.getBytes()     // Catch: org.json.JSONException -> Le4
            int r11 = r11.length     // Catch: org.json.JSONException -> Le4
            double r11 = (double) r11     // Catch: org.json.JSONException -> Le4
            double r16 = r16 + r11
            r11 = r10
            com.umeng.socialize.net.dplus.db.DBManager r10 = com.umeng.socialize.net.dplus.db.DBManager.get(r21)     // Catch: org.json.JSONException -> Le4
            r12 = r11
            java.lang.String r11 = "dau"
            r13 = r12
            java.util.ArrayList<java.lang.Integer> r12 = r1.dauList     // Catch: org.json.JSONException -> Le4
            r18 = r13
            double r13 = r8 - r16
            r19 = r18
            org.json.JSONArray r10 = r10.select(r11, r12, r13, r15)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = r10.toString()     // Catch: org.json.JSONException -> Le4
            byte[] r11 = r11.getBytes()     // Catch: org.json.JSONException -> Le4
            int r11 = r11.length     // Catch: org.json.JSONException -> Le4
            double r11 = (double) r11     // Catch: org.json.JSONException -> Le4
            double r16 = r16 + r11
            com.umeng.socialize.net.dplus.db.DBManager r11 = com.umeng.socialize.net.dplus.db.DBManager.get(r21)     // Catch: org.json.JSONException -> Le4
            r12 = r10
            r10 = r11
            java.lang.String r11 = "stats"
            r13 = r12
            java.util.ArrayList<java.lang.Integer> r12 = r1.statsList     // Catch: org.json.JSONException -> Le4
            double r16 = r8 - r16
            r21 = r13
            r13 = r16
            org.json.JSONArray r10 = r10.select(r11, r12, r13, r15)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = r10.toString()     // Catch: org.json.JSONException -> Le4
            byte[] r11 = r11.getBytes()     // Catch: org.json.JSONException -> Le4
            int r11 = r11.length     // Catch: org.json.JSONException -> Le4
            checkFile()     // Catch: org.json.JSONException -> Le4
            int r11 = r21.length()     // Catch: org.json.JSONException -> Le4
            if (r11 == 0) goto Le9
            java.lang.String r11 = "dau"
            r13 = r21
            r3.put(r11, r13)     // Catch: org.json.JSONException -> Le4
            goto Leb
        Le4:
            r0 = move-exception
            r16 = r8
            goto L177
        Le9:
            r13 = r21
        Leb:
            int r11 = r5.length()     // Catch: org.json.JSONException -> Le4
            if (r11 == 0) goto Lf6
            java.lang.String r11 = "s_e"
            r3.put(r11, r5)     // Catch: org.json.JSONException -> Le4
        Lf6:
            int r11 = r22.length()     // Catch: org.json.JSONException -> Le4
            if (r11 == 0) goto L104
            java.lang.String r11 = "auth"
            r12 = r22
            r3.put(r11, r12)     // Catch: org.json.JSONException -> Le4
            goto L106
        L104:
            r12 = r22
        L106:
            int r11 = r19.length()     // Catch: org.json.JSONException -> Le4
            if (r11 == 0) goto L145
            r11 = 0
        L10d:
            int r14 = r19.length()     // Catch: org.json.JSONException -> Le4
            if (r11 >= r14) goto L13b
            r14 = r19
            org.json.JSONObject r15 = r14.optJSONObject(r11)     // Catch: org.json.JSONException -> Le4
            if (r15 == 0) goto L132
            r16 = r8
            java.lang.String r8 = r15.optString(r0, r7)     // Catch: org.json.JSONException -> L130
            if (r8 == 0) goto L134
            java.lang.String r9 = new java.lang.String     // Catch: org.json.JSONException -> L130
            byte[] r8 = android.util.Base64.decode(r8, r4)     // Catch: org.json.JSONException -> L130
            r9.<init>(r8)     // Catch: org.json.JSONException -> L130
            r15.put(r0, r9)     // Catch: org.json.JSONException -> L130
            goto L134
        L130:
            r0 = move-exception
            goto L177
        L132:
            r16 = r8
        L134:
            int r11 = r11 + 1
            r19 = r14
            r8 = r16
            goto L10d
        L13b:
            r16 = r8
            r14 = r19
            java.lang.String r0 = "userinfo"
            r3.put(r0, r14)     // Catch: org.json.JSONException -> L130
            goto L149
        L145:
            r16 = r8
            r14 = r19
        L149:
            int r0 = r10.length()     // Catch: org.json.JSONException -> L130
            if (r0 == 0) goto L152
            r3.put(r6, r10)     // Catch: org.json.JSONException -> L130
        L152:
            java.lang.String r0 = "share"
            r2.put(r0, r3)     // Catch: org.json.JSONException -> L130
            int r0 = r5.length()     // Catch: org.json.JSONException -> L130
            if (r0 != 0) goto L17c
            int r0 = r12.length()     // Catch: org.json.JSONException -> L130
            if (r0 != 0) goto L17c
            int r0 = r14.length()     // Catch: org.json.JSONException -> L130
            if (r0 != 0) goto L17c
            int r0 = r13.length()     // Catch: org.json.JSONException -> L130
            if (r0 != 0) goto L17c
            int r0 = r10.length()     // Catch: org.json.JSONException -> L130
            if (r0 != 0) goto L17c
            r2 = r7
            goto L17c
        L177:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r3, r0)
        L17c:
            if (r2 == 0) goto L18d
            java.lang.String r0 = r2.toString()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            double r3 = (double) r0
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L18d
            return r7
        L18d:
            return r2
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public org.json.JSONObject setupReportData(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(java.lang.Object r8, int r9) {
            r7 = this;
            java.lang.String r0 = "MobclickRT"
            switch(r9) {
                case 24592: goto L68;
                case 24593: goto L18;
                case 24594: goto L9;
                default: goto L5;
            }
        L5:
            r7.saveFile(r8, r9)
            return
        L9:
            java.lang.String r8 = "--->>> Share: AZX_TRIGGER"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r8)
            com.umeng.socialize.a.h.a()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            java.lang.String r8 = "--->>> Share: AZX_TASK invoke exception!"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r8)
            return
        L18:
            java.lang.String r8 = "--->>> Share: BUILD_ENVELOPE"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r8)
            org.json.JSONObject r2 = r7.constructHeader()
            if (r2 == 0) goto L67
            android.content.Context r8 = r7.mConetxt
            org.json.JSONObject r3 = r7.readData(r8, r9)
            if (r3 == 0) goto L5f
            android.content.Context r1 = r7.mConetxt
            java.lang.String r5 = "s"
            java.lang.String r6 = "7.3.2"
            java.lang.String r4 = "umpx_share"
            org.json.JSONObject r8 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L64
            java.lang.String r9 = "exception"
            boolean r8 = r8.has(r9)
            if (r8 == 0) goto L54
            java.lang.String r8 = "--->>> Share: 构建信封失败!"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r8)
            int r8 = r3.optInt(r9)
            r9 = 101(0x65, float:1.42E-43)
            if (r8 == r9) goto L64
            android.content.Context r8 = r7.mConetxt
            r7.deleteData(r8)
            goto L64
        L54:
            java.lang.String r8 = "--->>> Share: 构建信封成功，删除本地数据!"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r8)
            android.content.Context r8 = r7.mConetxt
            r7.deleteData(r8)
            goto L64
        L5f:
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.NET.BODYNULL
            com.umeng.socialize.utils.SLog.E(r8)
        L64:
            r7.clearAllList()
        L67:
            return
        L68:
            java.lang.String r8 = "--->>> Share: REGIST_TO_WORK_QUEUE"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r8)
            return
    }
}
