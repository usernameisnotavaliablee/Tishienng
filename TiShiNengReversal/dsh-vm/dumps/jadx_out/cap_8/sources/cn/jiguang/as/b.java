package cn.jiguang.as;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f648c = "SubSDKAPiManager";

    /* renamed from: d, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> f649d;
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f650b;



    private static final class a {
        private static final cn.jiguang.as.b a = null;

        static {
                cn.jiguang.as.b r0 = new cn.jiguang.as.b
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.as.b.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.as.b a() {
                cn.jiguang.as.b r0 = cn.jiguang.as.b.a.a
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.as.b.f649d = r0
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = cn.jiguang.av.c.a()
            r2.a = r0
            cn.jiguang.e.a r1 = cn.jiguang.e.a.L()
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.f650b = r0
            return
    }

    /* synthetic */ b(cn.jiguang.as.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.as.b a() {
            cn.jiguang.as.b r0 = cn.jiguang.as.b.a.a()
            return r0
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "init"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "0"
            return r2
        Lb:
            java.lang.String r0 = "setSmartPushEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            java.lang.String r2 = "1"
            return r2
        L16:
            java.lang.String r0 = "setLinkMergeEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            java.lang.String r2 = "2"
            return r2
        L21:
            java.lang.String r0 = "setGeofenceEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "3"
            return r2
        L2c:
            java.lang.String r0 = "setCollectControl"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
            java.lang.String r2 = "4"
            return r2
        L37:
            java.lang.String r0 = "setNotificationCallBackEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L42
            java.lang.String r2 = "5"
            return r2
        L42:
            java.lang.String r0 = "resumePush"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4d
            java.lang.String r2 = "6"
            return r2
        L4d:
            java.lang.String r0 = "stopPush"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L58
            java.lang.String r2 = "7"
            return r2
        L58:
            java.lang.String r0 = "isPushStopped"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L63
            java.lang.String r2 = "8"
            return r2
        L63:
            java.lang.String r0 = "setChannel"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L6e
            java.lang.String r2 = "9"
            return r2
        L6e:
            java.lang.String r0 = "setPushTime"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L79
            java.lang.String r2 = "10"
            return r2
        L79:
            java.lang.String r0 = "setSilenceTime"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L84
            java.lang.String r2 = "11"
            return r2
        L84:
            java.lang.String r0 = "getRegistrationID"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8f
            java.lang.String r2 = "12"
            return r2
        L8f:
            java.lang.String r0 = "JPushActivityLifeCallBack"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9a
            java.lang.String r2 = "13"
            return r2
        L9a:
            java.lang.String r0 = "getUdid"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La5
            java.lang.String r2 = "14"
            return r2
        La5:
            java.lang.String r0 = "JCoreInterface.setWakeEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb0
            java.lang.String r2 = "15"
            return r2
        Lb0:
            java.lang.String r0 = "JCollectionAuth.setAuth"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lbb
            java.lang.String r2 = "16"
            return r2
        Lbb:
            java.lang.String r0 = "JCollectionAuth.enableAutoWakeup"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc6
            java.lang.String r2 = "17"
            return r2
        Lc6:
            java.lang.String r0 = "JCollectionAuth.enableAppTerminate"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld1
            java.lang.String r2 = "18"
            return r2
        Ld1:
            java.lang.String r0 = "setLatestNotificationNumber"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ldc
            java.lang.String r2 = "19"
            return r2
        Ldc:
            java.lang.String r0 = "clearAllNotifications"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Le7
            java.lang.String r2 = "20"
            return r2
        Le7:
            java.lang.String r0 = "clearNotificationById"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf2
            java.lang.String r2 = "21"
            return r2
        Lf2:
            java.lang.String r0 = "setDefaultPushNotificationBuilder"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lfd
            java.lang.String r2 = "22"
            return r2
        Lfd:
            java.lang.String r0 = "setPushNotificationBuilder"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L108
            java.lang.String r2 = "23"
            return r2
        L108:
            java.lang.String r0 = "setProperties"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L113
            java.lang.String r2 = "24"
            return r2
        L113:
            java.lang.String r0 = "deleteProperties"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L11e
            java.lang.String r2 = "25"
            return r2
        L11e:
            java.lang.String r0 = "cleanProperties"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L129
            java.lang.String r2 = "26"
            return r2
        L129:
            java.lang.String r0 = "setTags"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L134
            java.lang.String r2 = "27"
            return r2
        L134:
            java.lang.String r0 = "addTags"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L13f
            java.lang.String r2 = "28"
            return r2
        L13f:
            java.lang.String r0 = "deleteTags"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L14a
            java.lang.String r2 = "29"
            return r2
        L14a:
            java.lang.String r0 = "cleanTags"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L155
            java.lang.String r2 = "30"
            return r2
        L155:
            java.lang.String r0 = "getAllTags"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L160
            java.lang.String r2 = "31"
            return r2
        L160:
            java.lang.String r0 = "checkTagBindState"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16b
            java.lang.String r2 = "32"
            return r2
        L16b:
            java.lang.String r0 = "setAlias"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L176
            java.lang.String r2 = "33"
            return r2
        L176:
            java.lang.String r0 = "deleteAlias"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L181
            java.lang.String r2 = "34"
            return r2
        L181:
            java.lang.String r0 = "getAlias"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L18c
            java.lang.String r2 = "35"
            return r2
        L18c:
            java.lang.String r0 = "setMobileNumber"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L197
            java.lang.String r2 = "36"
            return r2
        L197:
            java.lang.String r0 = "reportNotificationOpened"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a2
            java.lang.String r2 = "37"
            return r2
        L1a2:
            java.lang.String r0 = "reportMessageOpened"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1ad
            java.lang.String r2 = "38"
            return r2
        L1ad:
            java.lang.String r0 = "getConnectionState"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b8
            java.lang.String r2 = "39"
            return r2
        L1b8:
            java.lang.String r0 = "onResume"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1c3
            java.lang.String r2 = "40"
            return r2
        L1c3:
            java.lang.String r0 = "onPause"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1ce
            java.lang.String r2 = "41"
            return r2
        L1ce:
            java.lang.String r0 = "onFragmentResume"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d9
            java.lang.String r2 = "42"
            return r2
        L1d9:
            java.lang.String r0 = "onFragmentPause"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e4
            java.lang.String r2 = "43"
            return r2
        L1e4:
            java.lang.String r0 = "onKillProcess"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1ef
            java.lang.String r2 = "44"
            return r2
        L1ef:
            java.lang.String r0 = "initCrashHandler"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1fa
            java.lang.String r2 = "45"
            return r2
        L1fa:
            java.lang.String r0 = "stopCrashHandler"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L205
            java.lang.String r2 = "46"
            return r2
        L205:
            java.lang.String r0 = "addLocalNotification"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L210
            java.lang.String r2 = "47"
            return r2
        L210:
            java.lang.String r0 = "removeLocalNotification"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21b
            java.lang.String r2 = "48"
            return r2
        L21b:
            java.lang.String r0 = "clearLocalNotifications"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L226
            java.lang.String r2 = "49"
            return r2
        L226:
            java.lang.String r0 = "setDefaultNotifactionNumber"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L231
            java.lang.String r2 = "50"
            return r2
        L231:
            java.lang.String r0 = "setGeofenceInterval"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L23c
            java.lang.String r2 = "51"
            return r2
        L23c:
            java.lang.String r0 = "setMaxGeofenceNumber"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L247
            java.lang.String r2 = "52"
            return r2
        L247:
            java.lang.String r0 = "deleteGeofence"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L252
            java.lang.String r2 = "53"
            return r2
        L252:
            java.lang.String r0 = "setBadgeNumber"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L25d
            java.lang.String r2 = "54"
            return r2
        L25d:
            java.lang.String r0 = "isNotificationEnabled"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L268
            java.lang.String r2 = "55"
            return r2
        L268:
            java.lang.String r0 = "setLbsEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L273
            java.lang.String r2 = "56"
            return r2
        L273:
            java.lang.String r0 = "goToAppNotificationSettings"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27e
            java.lang.String r2 = "57"
            return r2
        L27e:
            java.lang.String r0 = "reportWakedData"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L289
            java.lang.String r2 = "58"
            return r2
        L289:
            java.lang.String r0 = "pullInAppMessageWithType"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L294
            java.lang.String r2 = "59"
            return r2
        L294:
            java.lang.String r0 = "pullInAppMessageWithPosition"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L29f
            java.lang.String r2 = "60"
            return r2
        L29f:
            java.lang.String r0 = "pullInAppMessageWithParams"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2aa
            java.lang.String r2 = "61"
            return r2
        L2aa:
            java.lang.String r0 = "pullInAppMessage"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2b5
            java.lang.String r2 = "62"
            return r2
        L2b5:
            java.lang.String r0 = "triggerInAppMsgByEvent"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c0
            java.lang.String r2 = "63"
            return r2
        L2c0:
            java.lang.String r0 = "si"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2cb
            java.lang.String r2 = "64"
            return r2
        L2cb:
            java.lang.String r0 = "checkSupportVasMessage"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2d6
            java.lang.String r2 = "65"
            return r2
        L2d6:
            java.lang.String r0 = "setHbPeriodEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2e1
            java.lang.String r2 = "66"
            return r2
        L2e1:
            java.lang.String r0 = "setThirdToken"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2ec
            java.lang.String r2 = "67"
            return r2
        L2ec:
            java.lang.String r0 = "setThirdPushEnable"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2f7
            java.lang.String r2 = "68"
            return r2
        L2f7:
            java.lang.String r0 = "setAliasAndTags_setAlias_setTags"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L302
            java.lang.String r2 = "69"
            return r2
        L302:
            java.lang.String r0 = "normalExecutor"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L30d
            java.lang.String r2 = "70"
            return r2
        L30d:
            java.lang.String r0 = "futureExecutor"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L318
            java.lang.String r2 = "71"
            return r2
        L318:
            java.lang.String r2 = ""
            return r2
    }

    public static java.util.ArrayList<org.json.JSONArray> a(org.json.JSONArray r8) {
            r0 = 0
            if (r8 == 0) goto L88
            int r1 = r8.length()
            if (r1 != 0) goto Lb
            goto L88
        Lb:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            r3 = 0
            r4 = 0
        L17:
            int r5 = r8.length()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            if (r3 >= r5) goto L59
            org.json.JSONObject r5 = r8.optJSONObject(r3)     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            if (r5 == 0) goto L56
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            if (r6 != 0) goto L2a
            goto L56
        L2a:
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            int r6 = r6.length     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            int r4 = r4 + r6
            r7 = 102400(0x19000, float:1.43493E-40)
            if (r4 <= r7) goto L53
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            if (r4 <= 0) goto L49
            r2.add(r1)     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            goto L49
        L45:
            r8 = move-exception
            goto L63
        L47:
            r8 = move-exception
            goto L7e
        L49:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            r1.put(r5)     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            r4 = r6
            goto L56
        L53:
            r1.put(r5)     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
        L56:
            int r3 = r3 + 1
            goto L17
        L59:
            int r8 = r1.length()     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
            if (r8 <= 0) goto L62
            r2.add(r1)     // Catch: java.lang.Throwable -> L45 java.io.UnsupportedEncodingException -> L47
        L62:
            return r2
        L63:
            java.lang.String r1 = cn.jiguang.as.b.f648c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "partition throwable:"
        L6c:
            r2.append(r3)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            cn.jiguang.w.f.i(r1, r8)
            goto L88
        L7e:
            java.lang.String r1 = cn.jiguang.as.b.f648c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "partition exception:"
            goto L6c
        L88:
            return r0
    }

    static /* synthetic */ void a(cn.jiguang.as.b r0) {
            r0.c()
            return
    }

    static /* synthetic */ void a(cn.jiguang.as.b r0, java.lang.String r1, int r2, java.lang.String r3, android.os.Bundle r4, java.lang.Object[] r5) {
            r0.b(r1, r2, r3, r4, r5)
            return
    }

    private void b(java.lang.String r5, int r6, java.lang.String r7, android.os.Bundle r8, java.lang.Object[] r9) {
            r4 = this;
            java.lang.String r0 = r4.c(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto Lb
            goto L5b
        Lb:
            java.lang.String r9 = java.util.Arrays.toString(r9)     // Catch: java.lang.Throwable -> L58
            org.json.JSONObject r8 = cn.jiguang.av.v.a(r8)     // Catch: java.lang.Throwable -> L58
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "m"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "t"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L58
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r0.<init>()     // Catch: java.lang.Throwable -> L58
            r0.append(r5)     // Catch: java.lang.Throwable -> L58
            r0.append(r6)     // Catch: java.lang.Throwable -> L58
            r0.append(r7)     // Catch: java.lang.Throwable -> L58
            r0.append(r8)     // Catch: java.lang.Throwable -> L58
            r0.append(r9)     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L58
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> r6 = cn.jiguang.as.b.f649d     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L58
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L58
            if (r6 != 0) goto L5b
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> r6 = cn.jiguang.as.b.f649d     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L58
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L58
            return
        L58:
            r0 = move-exception
            r5 = r0
            goto L5c
        L5b:
            return
        L5c:
            java.lang.String r6 = cn.jiguang.as.b.f648c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "throwable="
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            cn.jiguang.w.f.c(r6, r5)
            return
    }

    private java.lang.String c(java.lang.String r20, int r21, java.lang.String r22, android.os.Bundle r23, java.lang.Object... r24) {
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r4 = java.util.Arrays.asList(r24)
            r3.<init>(r4)
            java.util.HashMap r4 = cn.jiguang.av.v.b(r23)
            java.lang.String r5 = "JPUSH"
            boolean r6 = r5.equals(r0)
            r7 = 3
            if (r6 == 0) goto L2a
            if (r7 != r1) goto L2a
            java.lang.String r6 = "init"
            boolean r8 = r6.equals(r2)
            if (r8 == 0) goto L2a
        L26:
            r0 = r19
            goto L7c3
        L2a:
            boolean r6 = r5.equals(r0)
            java.lang.String r8 = "setSmartPushEnable"
            java.lang.String r9 = "enable_smart_push"
            java.lang.String r10 = "enable"
            java.lang.String r11 = "disable_c_c"
            java.lang.String r12 = "enable_c_c"
            r13 = 111(0x6f, float:1.56E-43)
            if (r6 == 0) goto L5b
            if (r13 != r1) goto L5b
            boolean r6 = r4.containsKey(r12)
            if (r6 == 0) goto L5b
            boolean r6 = r4.containsKey(r11)
            if (r6 == 0) goto L5b
            boolean r6 = r4.containsKey(r10)
            if (r6 == 0) goto L5b
            boolean r6 = r4.containsKey(r9)
            if (r6 == 0) goto L5b
        L56:
            r0 = r19
            r6 = r8
            goto L7c3
        L5b:
            boolean r6 = r5.equals(r0)
            java.lang.String r14 = "setLinkMergeEnable"
            java.lang.String r15 = "enable_link_push"
            if (r6 == 0) goto L84
            if (r13 != r1) goto L84
            boolean r6 = r4.containsKey(r12)
            if (r6 == 0) goto L84
            boolean r6 = r4.containsKey(r11)
            if (r6 == 0) goto L84
            boolean r6 = r4.containsKey(r10)
            if (r6 == 0) goto L84
            boolean r6 = r4.containsKey(r15)
            if (r6 == 0) goto L84
            r0 = r19
            r6 = r14
            goto L7c3
        L84:
            boolean r6 = r5.equals(r0)
            java.lang.String r7 = "enable_geo_push"
            if (r6 == 0) goto Laa
            if (r13 != r1) goto Laa
            boolean r6 = r4.containsKey(r12)
            if (r6 == 0) goto Laa
            boolean r6 = r4.containsKey(r11)
            if (r6 == 0) goto Laa
            boolean r6 = r4.containsKey(r10)
            if (r6 == 0) goto Laa
            boolean r6 = r4.containsKey(r7)
            if (r6 == 0) goto Laa
        La6:
            java.lang.String r6 = "setGeofenceEnable"
            goto L26
        Laa:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto Lc2
            if (r13 != r1) goto Lc2
            boolean r6 = r4.containsKey(r12)
            if (r6 == 0) goto Lc2
            boolean r6 = r4.containsKey(r11)
            if (r6 == 0) goto Lc2
            java.lang.String r6 = "setCollectControl"
            goto L26
        Lc2:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto Ldd
            r6 = 3
            if (r6 != r1) goto Ldd
            java.lang.String r6 = "enable_notification_callback"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Ldd
            boolean r6 = r4.containsKey(r10)
            if (r6 == 0) goto Ldd
            java.lang.String r6 = "setNotificationCallBackEnable"
            goto L26
        Ldd:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto Lf2
            r6 = 3
            if (r6 != r1) goto Lf2
            java.lang.String r6 = "resume"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Lf2
            java.lang.String r6 = "resumePush"
            goto L26
        Lf2:
            boolean r6 = r5.equals(r0)
            java.lang.String r10 = "0"
            java.lang.String r11 = "action_type"
            java.lang.String r12 = "proto_type"
            java.lang.String r13 = "tagalis"
            if (r6 == 0) goto L125
            r6 = 3
            if (r6 != r1) goto L125
            boolean r6 = r13.equals(r2)
            if (r6 == 0) goto L125
            java.lang.String r6 = "4"
            r24 = r8
            java.lang.Object r8 = r4.get(r12)
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L127
            java.lang.Object r6 = r4.get(r11)
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            java.lang.String r6 = "stopPush"
            goto L26
        L125:
            r24 = r8
        L127:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L13c
            r6 = 3
            if (r6 != r1) goto L13c
            java.lang.String r6 = "check_stop"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L13c
            java.lang.String r6 = "isPushStopped"
            goto L26
        L13c:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L14a
            r6 = 9
            if (r6 != r1) goto L14a
            java.lang.String r6 = "setChannel"
            goto L26
        L14a:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L167
            r6 = 3
            if (r6 != r1) goto L167
            java.lang.String r6 = "pushtime"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L167
            java.lang.String r6 = "time"
            boolean r6 = r4.containsKey(r6)
            if (r6 == 0) goto L167
            java.lang.String r6 = "setPushTime"
            goto L26
        L167:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L184
            r6 = 3
            if (r6 != r1) goto L184
            java.lang.String r6 = "silenceTime"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L184
            java.lang.String r6 = "time"
            boolean r6 = r4.containsKey(r6)
            if (r6 == 0) goto L184
            java.lang.String r6 = "setSilenceTime"
            goto L26
        L184:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L199
            r6 = 3
            if (r6 != r1) goto L19a
            java.lang.String r8 = "get_rid"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L19a
            java.lang.String r6 = "getRegistrationID"
            goto L26
        L199:
            r6 = 3
        L19a:
            boolean r8 = r5.equals(r0)
            if (r8 == 0) goto L1ae
            if (r6 != r1) goto L1ae
            java.lang.String r6 = "change_foreground"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L1ae
            java.lang.String r6 = "JPushActivityLifeCallBack"
            goto L26
        L1ae:
            r6 = 8
            if (r6 != r1) goto L1b6
            java.lang.String r6 = "getUdid"
            goto L26
        L1b6:
            r6 = 73
            if (r6 != r1) goto L1be
            java.lang.String r6 = "JCoreInterface.setWakeEnable"
            goto L26
        L1be:
            r6 = 96
            if (r6 != r1) goto L1c6
            java.lang.String r6 = "JCollectionAuth.setAuth"
            goto L26
        L1c6:
            r6 = 109(0x6d, float:1.53E-43)
            if (r6 != r1) goto L1ce
            java.lang.String r6 = "JCollectionAuth.enableAutoWakeup"
            goto L26
        L1ce:
            r6 = 119(0x77, float:1.67E-43)
            if (r6 != r1) goto L1d6
            java.lang.String r6 = "JCollectionAuth.enableAppTerminate"
            goto L26
        L1d6:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L1f3
            r6 = 3
            if (r6 != r1) goto L1f3
            java.lang.String r6 = "max_num"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L1f3
            java.lang.String r6 = "num"
            boolean r6 = r4.containsKey(r6)
            if (r6 == 0) goto L1f3
            java.lang.String r6 = "setLatestNotificationNumber"
            goto L26
        L1f3:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L208
            r6 = 3
            if (r6 != r1) goto L209
            java.lang.String r8 = "clear_all_notify"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L209
            java.lang.String r6 = "clearAllNotifications"
            goto L26
        L208:
            r6 = 3
        L209:
            boolean r8 = r5.equals(r0)
            if (r8 == 0) goto L225
            if (r6 != r1) goto L225
            java.lang.String r6 = "clear_by_id"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L225
            java.lang.String r6 = "id"
            boolean r6 = r4.containsKey(r6)
            if (r6 == 0) goto L225
        L221:
            java.lang.String r6 = "clearNotificationById"
            goto L26
        L225:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L250
            r6 = 3
            if (r6 != r1) goto L250
            java.lang.String r6 = "set_custom_notify"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L250
            java.lang.String r6 = "buidler_string"
            boolean r6 = r4.containsKey(r6)
            if (r6 == 0) goto L250
            java.lang.String r6 = "buidler_id"
            java.lang.Object r6 = r4.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L250
            java.lang.String r6 = "setDefaultPushNotificationBuilder"
            goto L26
        L250:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L26d
            r6 = 3
            if (r6 != r1) goto L26d
            java.lang.String r6 = "set_custom_notify"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L26d
            java.lang.String r6 = "buidler_string"
            boolean r6 = r4.containsKey(r6)
            if (r6 == 0) goto L26d
            java.lang.String r6 = "setPushNotificationBuilder"
            goto L26
        L26d:
            boolean r6 = r5.equals(r0)
            java.lang.String r8 = "3"
            if (r6 == 0) goto L296
            r6 = 3
            if (r6 != r1) goto L296
            boolean r6 = r13.equals(r2)
            if (r6 == 0) goto L296
            java.lang.Object r6 = r4.get(r12)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L296
            java.lang.Object r6 = r4.get(r11)
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L296
            java.lang.String r6 = "setProperties"
            goto L26
        L296:
            boolean r6 = r5.equals(r0)
            r16 = r6
            java.lang.String r6 = "1"
            if (r16 == 0) goto L2c3
            r16 = r14
            r14 = 3
            if (r14 != r1) goto L2c5
            boolean r14 = r13.equals(r2)
            if (r14 == 0) goto L2c5
            java.lang.Object r14 = r4.get(r12)
            boolean r14 = r8.equals(r14)
            if (r14 == 0) goto L2c5
            java.lang.Object r14 = r4.get(r11)
            boolean r14 = r6.equals(r14)
            if (r14 == 0) goto L2c5
            java.lang.String r6 = "deleteProperties"
            goto L26
        L2c3:
            r16 = r14
        L2c5:
            boolean r14 = r5.equals(r0)
            r17 = r14
            java.lang.String r14 = "2"
            if (r17 == 0) goto L2f2
            r17 = r10
            r10 = 3
            if (r10 != r1) goto L2f4
            boolean r10 = r13.equals(r2)
            if (r10 == 0) goto L2f4
            java.lang.Object r10 = r4.get(r12)
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L2f4
            java.lang.Object r10 = r4.get(r11)
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L2f4
            java.lang.String r6 = "cleanProperties"
            goto L26
        L2f2:
            r17 = r10
        L2f4:
            boolean r10 = r5.equals(r0)
            if (r10 == 0) goto L31b
            r10 = 3
            if (r10 != r1) goto L31b
            boolean r10 = r13.equals(r2)
            if (r10 == 0) goto L31b
            java.lang.Object r10 = r4.get(r12)
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L31b
            java.lang.Object r10 = r4.get(r11)
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L31b
            java.lang.String r6 = "setTags"
            goto L26
        L31b:
            boolean r10 = r5.equals(r0)
            if (r10 == 0) goto L342
            r10 = 3
            if (r10 != r1) goto L342
            boolean r10 = r13.equals(r2)
            if (r10 == 0) goto L342
            java.lang.Object r10 = r4.get(r12)
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L342
            java.lang.Object r10 = r4.get(r11)
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L342
            java.lang.String r6 = "addTags"
            goto L26
        L342:
            boolean r10 = r5.equals(r0)
            if (r10 == 0) goto L369
            r10 = 3
            if (r10 != r1) goto L369
            boolean r10 = r13.equals(r2)
            if (r10 == 0) goto L369
            java.lang.Object r10 = r4.get(r12)
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L369
            java.lang.Object r10 = r4.get(r11)
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L369
            java.lang.String r6 = "deleteTags"
            goto L26
        L369:
            boolean r10 = r5.equals(r0)
            if (r10 == 0) goto L394
            r10 = 3
            if (r10 != r1) goto L394
            boolean r10 = r13.equals(r2)
            if (r10 == 0) goto L394
            java.lang.Object r10 = r4.get(r12)
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L394
            java.lang.String r10 = "4"
            r18 = r7
            java.lang.Object r7 = r4.get(r11)
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L396
            java.lang.String r6 = "cleanTags"
            goto L26
        L394:
            r18 = r7
        L396:
            boolean r7 = r5.equals(r0)
            if (r7 == 0) goto L3bf
            r10 = 3
            if (r10 != r1) goto L3bf
            boolean r7 = r13.equals(r2)
            if (r7 == 0) goto L3bf
            java.lang.Object r7 = r4.get(r12)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L3bf
            java.lang.String r7 = "5"
            java.lang.Object r10 = r4.get(r11)
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L3bf
            java.lang.String r6 = "getAllTags"
            goto L26
        L3bf:
            boolean r7 = r5.equals(r0)
            if (r7 == 0) goto L3e8
            r10 = 3
            if (r10 != r1) goto L3e8
            boolean r7 = r13.equals(r2)
            if (r7 == 0) goto L3e8
            java.lang.Object r7 = r4.get(r12)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L3e8
            java.lang.String r6 = "6"
            java.lang.Object r7 = r4.get(r11)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L3e8
            java.lang.String r6 = "checkTagBindState"
            goto L26
        L3e8:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L40f
            r6 = 3
            if (r6 != r1) goto L40f
            boolean r6 = r13.equals(r2)
            if (r6 == 0) goto L40f
            java.lang.Object r6 = r4.get(r12)
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L40f
            java.lang.Object r6 = r4.get(r11)
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L40f
            java.lang.String r6 = "setAlias"
            goto L26
        L40f:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L436
            r6 = 3
            if (r6 != r1) goto L436
            boolean r6 = r13.equals(r2)
            if (r6 == 0) goto L436
            java.lang.Object r6 = r4.get(r12)
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L436
            java.lang.Object r6 = r4.get(r11)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L436
            java.lang.String r6 = "deleteAlias"
            goto L26
        L436:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L45f
            r6 = 3
            if (r6 != r1) goto L45f
            boolean r6 = r13.equals(r2)
            if (r6 == 0) goto L45f
            java.lang.Object r6 = r4.get(r12)
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L45f
            java.lang.String r6 = "5"
            java.lang.Object r7 = r4.get(r11)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L45f
            java.lang.String r6 = "getAlias"
            goto L26
        L45f:
            boolean r6 = r5.equals(r0)
            if (r6 == 0) goto L474
            r6 = 3
            if (r6 != r1) goto L474
            java.lang.String r6 = "set_mobile"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L474
            java.lang.String r6 = "setMobileNumber"
            goto L26
        L474:
            boolean r6 = r5.equals(r0)
            java.lang.String r7 = "type"
            java.lang.String r8 = ""
            if (r6 == 0) goto L4c0
            r6 = 14
            if (r6 != r1) goto L4c0
            r0 = 0
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L56
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "msg_status"
            java.lang.String r2 = r0.optString(r7)     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L4a4
            java.lang.String r1 = "result"
            int r1 = r0.optInt(r1)     // Catch: java.lang.Throwable -> L56
            r2 = 1028(0x404, float:1.44E-42)
            if (r2 != r1) goto L4a4
            java.lang.String r0 = "reportNotificationOpened"
        L4a1:
            r6 = r0
            goto L26
        L4a4:
            java.lang.String r1 = "third_msg_status"
            java.lang.String r2 = r0.optString(r7)     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L4bd
            java.lang.String r1 = "result"
            int r0 = r0.optInt(r1)     // Catch: java.lang.Throwable -> L56
            r1 = 1028(0x404, float:1.44E-42)
            if (r1 != r0) goto L4bd
            java.lang.String r0 = "reportMessageOpened"
            goto L4a1
        L4bd:
            r6 = r8
            goto L26
        L4c0:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L4d5
            r6 = 3
            if (r6 != r1) goto L4d5
            java.lang.String r3 = "get_connection"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L4d5
            java.lang.String r6 = "getConnectionState"
            goto L26
        L4d5:
            boolean r3 = r5.equals(r0)
            r6 = 56
            if (r3 == 0) goto L4eb
            if (r6 != r1) goto L4eb
            java.lang.String r3 = "resume"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L4eb
            java.lang.String r6 = "onResume"
            goto L26
        L4eb:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L4ff
            if (r6 != r1) goto L4ff
            java.lang.String r3 = "pause"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L4ff
            java.lang.String r6 = "onPause"
            goto L26
        L4ff:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L513
            if (r6 != r1) goto L513
            java.lang.String r3 = "f_resume"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L513
            java.lang.String r6 = "onFragmentResume"
            goto L26
        L513:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L527
            if (r6 != r1) goto L527
            java.lang.String r3 = "f_pause"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L527
            java.lang.String r6 = "onFragmentPause"
            goto L26
        L527:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L53b
            if (r6 != r1) goto L53b
            java.lang.String r3 = "kill"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L53b
            java.lang.String r6 = "onKillProcess"
            goto L26
        L53b:
            java.lang.String r3 = "JCore"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L54b
            r3 = 70
            if (r3 != r1) goto L54b
            java.lang.String r6 = "initCrashHandler"
            goto L26
        L54b:
            java.lang.String r3 = "JCore"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L55b
            r3 = 71
            if (r3 != r1) goto L55b
            java.lang.String r6 = "stopCrashHandler"
            goto L26
        L55b:
            boolean r3 = r5.equals(r0)
            r6 = 3
            if (r3 == 0) goto L570
            if (r6 != r1) goto L570
            java.lang.String r3 = "add_local_notify"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L570
            java.lang.String r6 = "addLocalNotification"
            goto L26
        L570:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L584
            if (r6 != r1) goto L584
            java.lang.String r3 = "rm_local_notify"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L584
            java.lang.String r6 = "removeLocalNotification"
            goto L26
        L584:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L598
            if (r6 != r1) goto L598
            java.lang.String r3 = "clear_local_notify"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L598
            java.lang.String r6 = "clearLocalNotifications"
            goto L26
        L598:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L5bb
            if (r6 != r1) goto L5bb
            java.lang.String r3 = "max_num"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5bb
            java.lang.String r3 = "num"
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = 5
            if (r6 != r3) goto L5bb
            java.lang.String r6 = "setDefaultNotifactionNumber"
            goto L26
        L5bb:
            boolean r3 = r5.equals(r0)
            r6 = 3
            if (r3 == 0) goto L5d0
            if (r6 != r1) goto L5d0
            java.lang.String r3 = "geo_interval"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5d0
            java.lang.String r6 = "setGeofenceInterval"
            goto L26
        L5d0:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L5e4
            if (r6 != r1) goto L5e4
            java.lang.String r3 = "geo_fence_max_num"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5e4
            java.lang.String r6 = "setMaxGeofenceNumber"
            goto L26
        L5e4:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L5f8
            if (r6 != r1) goto L5f8
            java.lang.String r3 = "delete_geo_fence"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5f8
            java.lang.String r6 = "deleteGeofence"
            goto L26
        L5f8:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L60c
            if (r6 != r1) goto L60c
            java.lang.String r3 = "set_badge"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L60c
            java.lang.String r6 = "setBadgeNumber"
            goto L26
        L60c:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L620
            if (r6 != r1) goto L620
            boolean r3 = r9.equals(r2)
            if (r3 == 0) goto L620
            r0 = r19
            r6 = r24
            goto L7c3
        L620:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L634
            if (r6 != r1) goto L634
            boolean r3 = r15.equals(r2)
            if (r3 == 0) goto L634
            r0 = r19
            r6 = r16
            goto L7c3
        L634:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L646
            if (r6 != r1) goto L646
            r3 = r18
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L646
            goto La6
        L646:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L65a
            if (r6 != r1) goto L65a
            java.lang.String r3 = "is_enable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L65a
            java.lang.String r6 = "isNotificationEnabled"
            goto L26
        L65a:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L66e
            if (r6 != r1) goto L66e
            java.lang.String r3 = "enable_lbs"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L66e
            java.lang.String r6 = "setLbsEnable"
            goto L26
        L66e:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L682
            if (r6 != r1) goto L682
            java.lang.String r3 = "go_settings"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L682
            java.lang.String r6 = "goToAppNotificationSettings"
            goto L26
        L682:
            r3 = 74
            if (r3 != r1) goto L690
            boolean r3 = r4.containsKey(r7)
            if (r3 == 0) goto L690
            java.lang.String r6 = "reportWakedData"
            goto L26
        L690:
            boolean r3 = r5.equals(r0)
            java.lang.String r6 = "in_app_req"
            if (r3 == 0) goto L6ab
            r10 = 3
            if (r10 != r1) goto L6ab
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L6ab
            boolean r3 = r4.containsKey(r7)
            if (r3 == 0) goto L6ab
            java.lang.String r6 = "pullInAppMessageWithType"
            goto L26
        L6ab:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L6c6
            r10 = 3
            if (r10 != r1) goto L6c6
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L6c6
            java.lang.String r3 = "AdPositionKey"
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L6c6
            java.lang.String r6 = "pullInAppMessageWithPosition"
            goto L26
        L6c6:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L6e1
            r10 = 3
            if (r10 != r1) goto L6e1
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L6e1
            java.lang.String r3 = "inapp_param"
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L6e1
            java.lang.String r6 = "pullInAppMessageWithParams"
            goto L26
        L6e1:
            boolean r3 = r5.equals(r0)
            r10 = 3
            if (r3 == 0) goto L6f4
            if (r10 != r1) goto L6f4
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L6f4
            java.lang.String r6 = "pullInAppMessage"
            goto L26
        L6f4:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L708
            if (r10 != r1) goto L708
            java.lang.String r3 = "trigger_in_app_event"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L708
            java.lang.String r6 = "triggerInAppMsgByEvent"
            goto L26
        L708:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L71c
            if (r10 != r1) goto L71c
            java.lang.String r3 = "si"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L71c
            java.lang.String r6 = "si"
            goto L26
        L71c:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L730
            if (r10 != r1) goto L730
            java.lang.String r3 = "check_vas_integrate"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L730
            java.lang.String r6 = "checkSupportVasMessage"
            goto L26
        L730:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L744
            if (r10 != r1) goto L744
            java.lang.String r3 = "set_hb_period_enable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L744
            java.lang.String r6 = "setHbPeriodEnable"
            goto L26
        L744:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L758
            if (r10 != r1) goto L758
            java.lang.String r3 = "set_third_token"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L758
            java.lang.String r6 = "setThirdToken"
            goto L26
        L758:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L76c
            if (r10 != r1) goto L76c
            java.lang.String r3 = "third_enable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L76c
            java.lang.String r6 = "setThirdPushEnable"
            goto L26
        L76c:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L77e
            if (r10 != r1) goto L77e
            java.lang.String r3 = "clear_by_id"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L77e
            goto L221
        L77e:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L78c
            r3 = 75
            if (r3 != r1) goto L78c
            java.lang.String r6 = "normalExecutor"
            goto L26
        L78c:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L79a
            r3 = 76
            if (r3 != r1) goto L79a
            java.lang.String r6 = "futureExecutor"
            goto L26
        L79a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L56
            r6 = 3
            if (r6 != r1) goto L56
            boolean r0 = r13.equals(r2)
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.get(r12)
            r1 = r17
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.get(r11)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r6 = "setAliasAndTags_setAlias_setTags"
            goto L26
        L7c3:
            java.lang.String r1 = r0.a(r6)
            return r1
    }

    private void c() {
            r9 = this;
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> r1 = cn.jiguang.as.b.f649d     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto Lf
            goto Le6
        Lf:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L1c:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2a
            r1.put(r2)     // Catch: java.lang.Throwable -> L2a
            goto L1c
        L2a:
            r0 = move-exception
            goto Le7
        L2d:
            java.util.ArrayList r0 = a(r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto Le6
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L3b
            goto Le6
        L3b:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r3 = 0
        L41:
            if (r3 >= r1) goto Lb8
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r0.get(r3)     // Catch: java.lang.Throwable -> L2a
            org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch: java.lang.Throwable -> L2a
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r6.<init>()     // Catch: java.lang.Throwable -> L2a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r7.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = "api"
            r7.put(r8, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = "exception_type"
            java.lang.String r8 = "5"
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = "extra"
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L2a
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2a
            r5.<init>()     // Catch: java.lang.Throwable -> L2a
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2a
            r5.put(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = "exception_time"
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "result"
            java.lang.String r7 = "0_1"
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L2a
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2a
            r5.<init>()     // Catch: java.lang.Throwable -> L2a
            r5.put(r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "slice_index"
            int r3 = r3 + 1
            r4.put(r6, r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "slice_count"
            r4.put(r6, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "data"
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = cn.jiguang.as.b.f648c     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r6.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = "reportJson="
            r6.append(r7)     // Catch: java.lang.Throwable -> L2a
            r6.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.w.f.c(r5, r6)     // Catch: java.lang.Throwable -> L2a
            android.content.Context r5 = r9.a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = "exception_stats"
            cn.jiguang.z.b.b(r5, r4, r6)     // Catch: java.lang.Throwable -> L2a
            goto L41
        Lb8:
            r0 = 1
            r9.f650b = r0     // Catch: java.lang.Throwable -> L2a
            android.content.Context r1 = r9.a     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.e.a r3 = cn.jiguang.e.a.L()     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.e.a r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> L2a
            r0[r2] = r3     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.e.b.a(r1, r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = cn.jiguang.as.b.f648c     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "set had report="
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r9.f650b     // Catch: java.lang.Throwable -> L2a
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L2a
        Le6:
            return
        Le7:
            java.lang.String r1 = cn.jiguang.as.b.f648c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "set had throwable="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r1, r0)
            return
    }

    public void a(java.lang.String r10, int r11, java.lang.String r12, android.os.Bundle r13, java.lang.Object[] r14) {
            r9 = this;
            r0 = 18
            if (r0 != r11) goto L6
            goto L95
        L6:
            java.lang.String r0 = "JCore"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L16
            r0 = 70
            if (r0 == r11) goto L16
            r0 = 71
            if (r0 != r11) goto L95
        L16:
            android.content.Context r0 = r9.a     // Catch: java.lang.Throwable -> L75
            boolean r0 = cn.jiguang.av.a.b(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L95
            android.content.Context r0 = r9.a     // Catch: java.lang.Throwable -> L75
            cn.jiguang.e.a r1 = cn.jiguang.e.a.Y()     // Catch: java.lang.Throwable -> L75
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)     // Catch: java.lang.Throwable -> L75
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = cn.jiguang.as.b.f648c     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r2.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "save mHadReport="
            r2.append(r3)     // Catch: java.lang.Throwable -> L75
            boolean r3 = r9.f650b     // Catch: java.lang.Throwable -> L75
            r2.append(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L75
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = cn.jiguang.as.b.f648c     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r2.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = "save SubApiSwitch="
            r2.append(r3)     // Catch: java.lang.Throwable -> L75
            r2.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L75
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L75
            boolean r1 = r9.f650b     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L95
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L63
            goto L95
        L63:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L75
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L75
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L75
            if (r0 == r1) goto L78
            r9.b(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L75
            return
        L75:
            r0 = move-exception
            r10 = r0
            goto L96
        L78:
            java.lang.String r0 = "NORMAL_TASK"
            cn.jiguang.as.b$2 r2 = new cn.jiguang.as.b$2     // Catch: java.lang.Throwable -> L75
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L75
            r11 = r5
            java.util.List<java.lang.Integer> r10 = cn.jiguang.c.b.a     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L75
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L75
            r10 = r10 ^ 1
            cn.jiguang.au.d.a(r0, r2, r10)     // Catch: java.lang.Throwable -> L75
        L95:
            return
        L96:
            java.lang.String r11 = cn.jiguang.as.b.f648c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "throwable="
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            cn.jiguang.w.f.c(r11, r10)
            return
    }

    public void b() {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L62
            cn.jiguang.e.a r1 = cn.jiguang.e.a.Y()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = cn.jiguang.e.b.a(r0, r1)     // Catch: java.lang.Throwable -> L62
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = cn.jiguang.as.b.f648c     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "send mHadReport="
            r2.append(r3)     // Catch: java.lang.Throwable -> L62
            boolean r3 = r4.f650b     // Catch: java.lang.Throwable -> L62
            r2.append(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L62
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = cn.jiguang.as.b.f648c     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "send SubApiSwitch="
            r2.append(r3)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L62
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L62
            boolean r1 = r4.f650b     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L62
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L45
            goto L62
        L45:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L62
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L62
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L62
            if (r0 == r1) goto L57
            r4.c()     // Catch: java.lang.Throwable -> L62
            return
        L57:
            java.lang.String r0 = "NORMAL_TASK"
            cn.jiguang.as.b$1 r1 = new cn.jiguang.as.b$1     // Catch: java.lang.Throwable -> L62
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r2 = 0
            cn.jiguang.au.d.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L62
        L62:
            return
    }
}
