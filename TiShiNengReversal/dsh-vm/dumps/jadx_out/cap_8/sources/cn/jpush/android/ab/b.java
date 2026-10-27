package cn.jpush.android.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> a;

    static {
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            cn.jpush.android.ab.b.a = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(long r7) {
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.ab.b.a
            int r0 = r0.size()
            r1 = 0
            r2 = 10
            if (r0 >= r2) goto L15
        Lb:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.ab.b.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.offer(r7)
            return r1
        L15:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.ab.b.a
            java.lang.Object r0 = r0.element()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r3 = r7 - r3
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L30
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r7 = cn.jpush.android.ab.b.a
            r7.clear()
            r7 = 2
            return r7
        L30:
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L44
        L36:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.ab.b.a
            int r0 = r0.size()
            if (r0 < r2) goto Lb
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.ab.b.a
            r0.poll()
            goto L36
        L44:
            r7 = 1
            return r7
    }

    public static long a(android.content.Context r10, java.lang.String r11, int r12, long r13, int r15) {
            java.lang.String r0 = "action - onRecvTagAliasCallBack"
            java.lang.String r1 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = 4
            if (r12 != r0) goto Le
            cn.jpush.android.ab.a.a(r10, r13, r15)     // Catch: java.lang.Throwable -> La6
            return r13
        Le:
            r0 = 3
            if (r12 == r0) goto L2a
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La6
            r15.<init>(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "code"
            int r3 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR     // Catch: java.lang.Throwable -> La6
            int r2 = r15.optInt(r2, r3)     // Catch: java.lang.Throwable -> La6
            if (r12 != 0) goto L26
            java.lang.String r13 = "sequence"
            long r13 = r15.optLong(r13)     // Catch: java.lang.Throwable -> La6
        L26:
            r5 = r13
            r8 = r15
            r7 = r2
            goto L2e
        L2a:
            r2 = 0
            r5 = r13
            r7 = r15
            r8 = r2
        L2e:
            android.content.Intent r13 = new android.content.Intent     // Catch: java.lang.Throwable -> La6
            r13.<init>()     // Catch: java.lang.Throwable -> La6
            if (r12 != 0) goto L3c
            java.lang.String r14 = "cn.jpush.android.intent.TAG_ALIAS_CALLBACK"
            r13.setAction(r14)     // Catch: java.lang.Throwable -> La6
        L3a:
            r9 = r13
            goto L6d
        L3c:
            java.lang.String r14 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r10)     // Catch: java.lang.Throwable -> La6
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La6
            if (r15 != 0) goto L4f
            android.content.Intent r13 = new android.content.Intent     // Catch: java.lang.Throwable -> La6
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch: java.lang.Throwable -> La6
            r13.<init>(r10, r14)     // Catch: java.lang.Throwable -> La6
        L4f:
            java.lang.String r14 = "tag_alias_message"
            r13.setAction(r14)     // Catch: java.lang.Throwable -> La6
            r14 = 1
            java.lang.String r15 = "message_type"
            if (r12 != r14) goto L5d
            r13.putExtra(r15, r14)     // Catch: java.lang.Throwable -> La6
            goto L3a
        L5d:
            if (r12 != r0) goto L68
            r13.putExtra(r15, r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r14 = "message_des"
            r13.putExtra(r14, r11)     // Catch: java.lang.Throwable -> La6
            goto L3a
        L68:
            r14 = 2
            r13.putExtra(r15, r14)     // Catch: java.lang.Throwable -> La6
            goto L3a
        L6d:
            java.lang.String r13 = r10.getPackageName()     // Catch: java.lang.Throwable -> La6
            r9.addCategory(r13)     // Catch: java.lang.Throwable -> La6
            java.lang.String r13 = "proto_type"
            r9.putExtra(r13, r12)     // Catch: java.lang.Throwable -> La6
            java.lang.String r13 = r10.getPackageName()     // Catch: java.lang.Throwable -> La6
            r9.setPackage(r13)     // Catch: java.lang.Throwable -> La6
            java.lang.String r13 = "tagalias_errorcode"
            r9.putExtra(r13, r7)     // Catch: java.lang.Throwable -> La6
            java.lang.String r13 = "tagalias_seqid"
            r9.putExtra(r13, r5)     // Catch: java.lang.Throwable -> La6
            if (r12 == r0) goto L96
            cn.jpush.android.ab.c r3 = cn.jpush.android.ab.c.a()     // Catch: java.lang.Throwable -> La6
            r4 = r10
            android.content.Intent r10 = r3.a(r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> La6
            goto La0
        L96:
            r4 = r10
            r8 = r9
            cn.jpush.android.ab.c r3 = cn.jpush.android.ab.c.a()     // Catch: java.lang.Throwable -> La6
            android.content.Intent r10 = r3.a(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> La6
        La0:
            if (r10 == 0) goto La5
            cn.jpush.android.helper.a.a(r4, r10)     // Catch: java.lang.Throwable -> La6
        La5:
            return r5
        La6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "tagalias msgContent:"
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.w(r1, r10)
            r10 = -1
            return r10
    }

    protected static java.lang.String a(android.content.Context r4, java.lang.String r5, long r6, int r8) {
            boolean r0 = c(r8)
            r1 = 0
            java.lang.String r2 = "TagAliasHelper"
            r3 = 2
            if (r0 == 0) goto L72
            org.json.JSONObject r0 = a(r8)     // Catch: java.lang.Throwable -> L25
            boolean r8 = b(r3, r8)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L33
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L27
            java.lang.String r5 = "alias was empty. Give up action."
            cn.jpush.android.helper.Logger.ee(r2, r5)     // Catch: java.lang.Throwable -> L25
            int r5 = cn.jpush.android.api.JPushInterface.ErrorCode.NULL_TAGANDALIAS     // Catch: java.lang.Throwable -> L25
            a(r4, r3, r5, r6)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r5 = move-exception
            goto L58
        L27:
            boolean r8 = a(r4, r3, r5, r6)     // Catch: java.lang.Throwable -> L25
            if (r8 != 0) goto L2e
            return r1
        L2e:
            java.lang.String r8 = "alias"
            r0.put(r8, r5)     // Catch: java.lang.Throwable -> L25
        L33:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r8.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "alias str:"
            r8.append(r0)     // Catch: java.lang.Throwable -> L25
            r8.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L25
            cn.jpush.android.helper.Logger.d(r2, r8)     // Catch: java.lang.Throwable -> L25
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L25
            if (r8 != 0) goto L52
            return r5
        L52:
            java.lang.String r5 = "alias request action was empty"
            cn.jpush.android.helper.Logger.d(r2, r5)     // Catch: java.lang.Throwable -> L25
            goto L78
        L58:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "alias exception:"
            r8.append(r0)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            cn.jpush.android.helper.Logger.w(r2, r5)
        L6c:
            int r5 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR
            a(r4, r3, r5, r6)
            goto L78
        L72:
            java.lang.String r5 = "unsupport alias action type"
            cn.jpush.android.helper.Logger.e(r2, r5)
            goto L6c
        L78:
            return r1
    }

    protected static java.lang.String a(android.content.Context r6, java.util.List<java.lang.String> r7, long r8, int r10, int r11, int r12) {
            r11 = 0
            java.lang.String r0 = "TagAliasHelper"
            r1 = 1
            if (r10 == 0) goto Lbb
            org.json.JSONObject r2 = a(r10)     // Catch: java.lang.Throwable -> L46
            boolean r3 = a(r1, r10)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L70
            if (r7 == 0) goto L65
            boolean r3 = r7.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L19
            goto L65
        L19:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L46
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L46
            boolean r4 = a(r6, r1, r3, r8)     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L25
            return r11
        L25:
            java.lang.String r3 = b(r3)     // Catch: java.lang.Throwable -> L46
            boolean r4 = b(r6, r3, r8, r1)     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L30
            return r11
        L30:
            r4 = 6
            java.lang.String r5 = "tags"
            if (r10 != r4) goto L48
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L61
            java.lang.String r7 = "stags was empty. Give up action."
            cn.jpush.android.helper.Logger.ee(r0, r7)     // Catch: java.lang.Throwable -> L46
            int r7 = cn.jpush.android.api.JPushInterface.ErrorCode.NULL_TAGANDALIAS     // Catch: java.lang.Throwable -> L46
            a(r6, r1, r7, r8)     // Catch: java.lang.Throwable -> L46
            return r11
        L46:
            r7 = move-exception
            goto La1
        L48:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L46
        L51:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L61
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L46
            r3.put(r4)     // Catch: java.lang.Throwable -> L46
            goto L51
        L61:
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L46
            goto L70
        L65:
            java.lang.String r7 = "tags was empty. Give up action."
            cn.jpush.android.helper.Logger.ee(r0, r7)     // Catch: java.lang.Throwable -> L46
            int r7 = cn.jpush.android.api.JPushInterface.ErrorCode.NULL_TAGANDALIAS     // Catch: java.lang.Throwable -> L46
            a(r6, r1, r7, r8)     // Catch: java.lang.Throwable -> L46
            return r11
        L70:
            r7 = 5
            if (r10 != r7) goto L7c
            java.lang.String r7 = "curr"
            r10 = -1
            if (r12 != r10) goto L79
            r12 = 1
        L79:
            r2.put(r7, r12)     // Catch: java.lang.Throwable -> L46
        L7c:
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r10.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r12 = "tag str:"
            r10.append(r12)     // Catch: java.lang.Throwable -> L46
            r10.append(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L46
            cn.jpush.android.helper.Logger.d(r0, r10)     // Catch: java.lang.Throwable -> L46
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L46
            if (r10 != 0) goto L9b
            return r7
        L9b:
            java.lang.String r7 = "tag request action was empty"
            cn.jpush.android.helper.Logger.d(r0, r7)     // Catch: java.lang.Throwable -> L46
            goto Lc1
        La1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "tag exception:"
            r10.append(r12)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            cn.jpush.android.helper.Logger.w(r0, r7)
        Lb5:
            int r7 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR
            a(r6, r1, r7, r8)
            goto Lc1
        Lbb:
            java.lang.String r7 = "unsupport tag action type"
            cn.jpush.android.helper.Logger.e(r0, r7)
            goto Lb5
        Lc1:
            return r11
    }

    private static java.lang.String a(android.content.Context r7, java.util.List<java.lang.String> r8, java.lang.String r9, long r10) {
            r0 = 0
            if (r8 == 0) goto L9
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r8)
            goto La
        L9:
            r1 = r0
        La:
            r8 = 0
            if (r9 == 0) goto L14
            boolean r2 = a(r7, r8, r9, r10)
            if (r2 != 0) goto L14
            return r0
        L14:
            if (r1 == 0) goto L1d
            boolean r2 = a(r7, r8, r1, r10)
            if (r2 != 0) goto L1d
            return r0
        L1d:
            java.lang.String r2 = b(r1)
            boolean r3 = b(r7, r2, r10, r8)
            if (r3 != 0) goto L28
            return r0
        L28:
            java.lang.String r3 = "TagAliasHelper"
            if (r2 != 0) goto L39
            if (r9 != 0) goto L39
            java.lang.String r9 = "NULL alias and tags. Give up action."
            cn.jpush.android.helper.Logger.ee(r3, r9)
            int r9 = cn.jpush.android.api.JPushInterface.ErrorCode.NULL_TAGANDALIAS
            a(r7, r8, r9, r10)
            return r0
        L39:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "action:setAliasAndTags - alias:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = ", tags:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.dd(r3, r4)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "platform"
            java.lang.String r6 = "a"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L6b
            java.lang.String r5 = "alias"
            r4.put(r5, r9)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r9 = move-exception
            goto L97
        L6b:
            if (r1 == 0) goto L72
            java.lang.String r9 = "tags"
            r4.put(r9, r2)     // Catch: java.lang.Throwable -> L69
        L72:
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "tagalias str:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L69
            r1.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L69
            cn.jpush.android.helper.Logger.d(r3, r1)     // Catch: java.lang.Throwable -> L69
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L91
            return r9
        L91:
            java.lang.String r9 = "tagalias request action was empty"
            cn.jpush.android.helper.Logger.d(r3, r9)     // Catch: java.lang.Throwable -> L69
            goto Lb0
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "tagalias exception:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            cn.jpush.android.helper.Logger.w(r3, r9)
            int r9 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR
            a(r7, r8, r9, r10)
        Lb0:
            return r0
    }

    protected static java.lang.String a(android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11, long r12, int r14) {
            boolean r0 = d(r14)
            r1 = 0
            r2 = 3
            java.lang.String r3 = "TagAliasHelper"
            if (r0 == 0) goto Lf4
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbf
            r0.<init>()     // Catch: java.lang.Throwable -> Lbf
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbf
            r4.<init>()     // Catch: java.lang.Throwable -> Lbf
            r5 = 2
            if (r14 != r5) goto L22
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L1c
            return r10
        L1c:
            r0 = move-exception
            r11 = r0
            r4 = r10
            r7 = r12
            goto Lda
        L22:
            boolean r14 = r11.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r14 == 0) goto L33
            java.lang.String r11 = "pros was empty. Give up action."
            cn.jpush.android.helper.Logger.ee(r3, r11)     // Catch: java.lang.Throwable -> L1c
            int r11 = cn.jpush.android.api.JPushInterface.ErrorCode.NULL_TAGANDALIAS     // Catch: java.lang.Throwable -> L1c
            a(r10, r2, r11, r12)     // Catch: java.lang.Throwable -> L1c
            return r1
        L33:
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> Lbf
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lbf
        L3b:
            boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> Lbf
            if (r14 == 0) goto La0
            java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L1c
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r5 = r14.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1c
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L5e
            java.lang.String r11 = "pros key was empty. Give up action."
            cn.jpush.android.helper.Logger.ee(r3, r11)     // Catch: java.lang.Throwable -> L1c
            int r11 = cn.jpush.android.api.JPushInterface.ErrorCode.NULL_TAGANDALIAS     // Catch: java.lang.Throwable -> L1c
            a(r10, r2, r11, r12)     // Catch: java.lang.Throwable -> L1c
            return r1
        L5e:
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L1c
            boolean r6 = r14 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = ""
            if (r6 != 0) goto L90
            boolean r6 = r14 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L6d
            goto L90
        L6d:
            boolean r6 = r14 instanceof java.util.Date     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L87
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r6.<init>()     // Catch: java.lang.Throwable -> L1c
            java.util.Date r14 = (java.util.Date) r14     // Catch: java.lang.Throwable -> L1c
            long r8 = r14.getTime()     // Catch: java.lang.Throwable -> L1c
            r6.append(r8)     // Catch: java.lang.Throwable -> L1c
            r6.append(r7)     // Catch: java.lang.Throwable -> L1c
            goto L9b
        L83:
            r0.put(r5, r14)     // Catch: java.lang.Throwable -> L1c
            goto L3b
        L87:
            boolean r6 = r14 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L8c
            goto L83
        L8c:
            r4.put(r5, r14)     // Catch: java.lang.Throwable -> L1c
            goto L3b
        L90:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r6.<init>()     // Catch: java.lang.Throwable -> L1c
            r6.append(r14)     // Catch: java.lang.Throwable -> L1c
            r6.append(r7)     // Catch: java.lang.Throwable -> L1c
        L9b:
            java.lang.String r14 = r6.toString()     // Catch: java.lang.Throwable -> L1c
            goto L83
        La0:
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> Lbf
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lbf
            if (r11 != 0) goto Lc3
            java.lang.String r11 = "{}"
            boolean r11 = r5.equals(r11)     // Catch: java.lang.Throwable -> Lbf
            if (r11 != 0) goto Lc3
            int r9 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_PROPERTY_ERROR     // Catch: java.lang.Throwable -> Lbf
            r6 = 3
            r4 = r10
            r7 = r12
            a(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> Lbc
            return r1
        Lbc:
            r0 = move-exception
        Lbd:
            r11 = r0
            goto Lda
        Lbf:
            r0 = move-exception
            r4 = r10
            r7 = r12
            goto Lbd
        Lc3:
            r4 = r10
            r7 = r12
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> Lbc
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lbc
            if (r10 != 0) goto Ld4
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> Lbc
            return r10
        Ld4:
            java.lang.String r10 = "pros request action was empty"
            cn.jpush.android.helper.Logger.d(r3, r10)     // Catch: java.lang.Throwable -> Lbc
            goto Lfc
        Lda:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "pros exception:"
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.w(r3, r10)
        Lee:
            int r10 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR
            a(r4, r2, r10, r7)
            goto Lfc
        Lf4:
            r4 = r10
            r7 = r12
            java.lang.String r10 = "unsupport pros action type"
            cn.jpush.android.helper.Logger.e(r3, r10)
            goto Lee
        Lfc:
            return r1
    }

    public static java.util.Set<java.lang.String> a(java.util.Set<java.lang.String> r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Lb
            return r6
        Lb:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L15:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "TagAliasHelper"
            if (r3 != 0) goto L3e
            boolean r3 = cn.jpush.android.ad.h.a(r2)
            if (r3 == 0) goto L3e
            r0.add(r2)
            int r1 = r1 + 1
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L15
            java.lang.String r6 = "The lenght of tags maybe more than 1000."
            cn.jpush.android.helper.Logger.ww(r4, r6)
            return r0
        L3e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Invalid tag : "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.helper.Logger.ee(r4, r2)
            goto L15
        L53:
            return r0
    }

    private static org.json.JSONObject a(int r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "platform"
            java.lang.String r2 = "a"
            r0.put(r1, r2)
            java.lang.String r1 = "op"
            java.lang.String r3 = b(r3)
            r0.put(r1, r3)
            return r0
    }

    public static void a(android.content.Context r6, int r7, int r8, long r9) {
            r5 = -1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            a(r0, r1, r2, r3, r5)
            return
    }

    public static void a(android.content.Context r2, int r3, int r4, long r5, int r7) {
            r0 = 4
            if (r3 != r0) goto L7
            cn.jpush.android.ab.a.a(r2, r4, r7)     // Catch: java.lang.Throwable -> L51
            return
        L7:
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> L51
            r7.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r2.getPackageName()     // Catch: java.lang.Throwable -> L51
            r7.addCategory(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r2.getPackageName()     // Catch: java.lang.Throwable -> L51
            r7.setPackage(r0)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L22
            java.lang.String r3 = "cn.jpush.android.intent.TAG_ALIAS_CALLBACK"
            r7.setAction(r3)     // Catch: java.lang.Throwable -> L51
            goto L43
        L22:
            java.lang.String r0 = "tag_alias_message"
            r7.setAction(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L51
            r7.setClass(r2, r0)     // Catch: java.lang.Throwable -> L51
            r0 = 1
            java.lang.String r1 = "message_type"
            if (r3 != r0) goto L3b
        L37:
            r7.putExtra(r1, r0)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3b:
            r0 = 3
            if (r3 != r0) goto L3f
            goto L37
        L3f:
            r3 = 2
            r7.putExtra(r1, r3)     // Catch: java.lang.Throwable -> L51
        L43:
            java.lang.String r3 = "tagalias_errorcode"
            r7.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "tagalias_seqid"
            r7.putExtra(r3, r5)     // Catch: java.lang.Throwable -> L51
            cn.jpush.android.helper.a.a(r2, r7)     // Catch: java.lang.Throwable -> L51
            return
        L51:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NotifyTagAliasError:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.ww(r3, r2)
            return
    }

    protected static void a(android.content.Context r11, int r12, long r13, java.lang.String r15) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "tagalias:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            if (r15 == 0) goto L48
            r0 = 1
            if (r12 != 0) goto L20
            r1 = 10
            r4 = 10
            goto L2b
        L20:
            if (r12 != r0) goto L27
            r1 = 28
            r4 = 28
            goto L2b
        L27:
            r1 = 29
            r4 = 29
        L2b:
            if (r12 != 0) goto L30
            r0 = 4
            r5 = 4
            goto L36
        L30:
            if (r12 != r0) goto L34
            r5 = 1
            goto L36
        L34:
            r0 = 2
            r5 = 2
        L36:
            java.lang.String r12 = cn.jpush.android.helper.JCoreHelper.getAppKey(r11)
            byte[] r10 = cn.jpush.android.z.b.a(r12, r4, r15)
            java.lang.String r3 = "JPUSH"
            r8 = 20000(0x4e20, double:9.8813E-320)
            r2 = r11
            r6 = r13
            cn.jpush.android.helper.JCoreHelper.sendRequest(r2, r3, r4, r5, r6, r8, r10)
            return
        L48:
            java.lang.String r11 = "tagaliasRequest was null"
            cn.jpush.android.helper.Logger.w(r1, r11)
            return
    }

    protected static void a(android.content.Context r11, long r12, int r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " protoType="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            byte[] r10 = cn.jpush.android.z.b.a(r14)
            r5 = 1
            r8 = 20000(0x4e20, double:9.8813E-320)
            java.lang.String r3 = "JPUSH"
            r4 = 40
            r2 = r11
            r6 = r12
            cn.jpush.android.helper.JCoreHelper.sendRequest(r2, r3, r4, r5, r6, r8, r10)
            return
    }

    protected static void a(android.content.Context r11, long r12, java.lang.String r14, int r15) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pros:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " protoType="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            if (r14 == 0) goto L31
            byte[] r10 = cn.jpush.android.z.b.a(r15, r14)
            r5 = 0
            r8 = 20000(0x4e20, double:9.8813E-320)
            java.lang.String r3 = "JPUSH"
            r4 = 38
            r2 = r11
            r6 = r12
            cn.jpush.android.helper.JCoreHelper.sendRequest(r2, r3, r4, r5, r6, r8, r10)
            return
        L31:
            java.lang.String r11 = "prosRequest was null"
            cn.jpush.android.helper.Logger.w(r1, r11)
            return
    }

    public static void a(android.content.Context r22, android.os.Bundle r23) {
            r1 = r22
            r2 = r23
            java.lang.String r8 = "TagAliasHelper"
            java.lang.String r9 = "alias"
            java.lang.String r10 = r2.getString(r9)
            java.lang.String r0 = "tags"
            java.util.ArrayList r6 = r2.getStringArrayList(r0)
            java.lang.String r0 = "callback"
            java.io.Serializable r0 = r2.getSerializable(r0)
            r11 = r0
            cn.jpush.android.api.CallBackParams r11 = (cn.jpush.android.api.CallBackParams) r11
            java.lang.String r0 = "seq"
            r3 = 0
            long r3 = r2.getLong(r0, r3)
            r5 = 0
            java.lang.String r0 = "proto_type"
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L30
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L30
            r13 = r0
            goto L4b
        L30:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "load tag/alias proto type failed - error:"
            r7.append(r12)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            cn.jpush.android.helper.Logger.w(r8, r0)
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR
            a(r1, r5, r0, r3)
            r13 = 0
        L4b:
            java.lang.String r0 = "action_type"
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L57
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L57
            r2 = r0
            goto L72
        L57:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "load tag/alias action type failed - error:"
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.w(r8, r0)
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.UNKNOWN_ERROR
            a(r1, r13, r0, r3)
            r2 = 0
        L72:
            r12 = 4
            r14 = 1
            if (r13 != r12) goto L80
            boolean r0 = cn.jpush.android.cache.a.b(r1, r5)
            if (r0 == 0) goto L80
            cn.jpush.android.ab.a.a(r1, r14, r2)
            return
        L80:
            boolean r0 = cn.jpush.android.cache.a.e(r1)
            r4 = r3
            if (r0 == 0) goto L8f
            int r3 = cn.jpush.android.api.JPushInterface.ErrorCode.PUSH_STOPED
            r6 = r2
            r2 = r13
            a(r1, r2, r3, r4, r6)
            return
        L8f:
            r7 = r6
            r6 = r2
            r2 = r13
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = a(r0)
            if (r0 == 0) goto Lb6
            if (r0 != r14) goto La4
            java.lang.String r1 = "set tags/alias too soon,over 10 times in 10s"
        La0:
            cn.jpush.android.helper.Logger.w(r8, r1)
            goto La7
        La4:
            java.lang.String r1 = "set tags/alias failed,time shaft error，please try again"
            goto La0
        La7:
            if (r0 != r14) goto Laf
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.INVOKE_TOO_SOON
        Lab:
            r1 = r22
            r3 = r0
            goto Lb2
        Laf:
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.INCORRECT_TIME
            goto Lab
        Lb2:
            a(r1, r2, r3, r4, r6)
            return
        Lb6:
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()
            r1 = r22
            r3 = r4
            r5 = r6
            boolean r0 = r0.a(r1, r2, r3, r5)
            r4 = r3
            if (r0 == 0) goto Lcd
            int r3 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_SERVER_UNAVAILABLE
            r1 = r22
            a(r1, r2, r3, r4, r6)
            return
        Lcd:
            r1 = r22
            r13 = r2
            r0 = 2
            r15 = 3
            if (r13 != 0) goto Le1
            java.lang.String r2 = "old tag/alias proto"
            cn.jpush.android.helper.Logger.d(r8, r2)
            java.lang.String r2 = a(r1, r7, r10, r4)
            r3 = r6
            r6 = r2
            r2 = r7
            goto L106
        Le1:
            if (r13 != r14) goto Lf3
            r2 = r6
            r6 = -1
            r3 = r4
            r5 = r2
            r2 = r7
            r7 = -1
            java.lang.String r6 = a(r1, r2, r3, r5, r6, r7)
            r20 = r3
            r3 = r5
            r4 = r20
            goto L106
        Lf3:
            r3 = r6
            r2 = r7
            if (r13 != r0) goto Lfc
            java.lang.String r6 = a(r1, r10, r4, r3)
            goto L106
        Lfc:
            if (r13 != r15) goto L105
            java.util.Map<java.lang.String, java.lang.Object> r6 = r11.pros
            java.lang.String r6 = a(r1, r6, r4, r3)
            goto L106
        L105:
            r6 = 0
        L106:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "onPushServiceTagAliasAction request="
            r7.append(r12)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            cn.jpush.android.helper.Logger.d(r8, r7)
            if (r6 == 0) goto L121
            if (r13 == r14) goto L126
            if (r13 != r0) goto L121
            goto L126
        L121:
            r12 = r6
            r6 = r10
            r10 = r1
            r1 = r13
            goto L16c
        L126:
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()
            boolean r0 = r0.a(r13)
            if (r0 == 0) goto L147
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()
            r7 = 0
            r20 = r4
            r5 = r2
            r2 = r3
            r3 = r20
            r12 = r6
            r6 = r10
            r10 = r1
            r1 = r13
            r0.a(r1, r2, r3, r5, r6, r7)
            r3 = r2
            r2 = r5
            r4 = r20
            goto L16c
        L147:
            r10 = r1
            r1 = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r1 != r14) goto L152
            java.lang.String r9 = "tag"
        L152:
            r0.append(r9)
            java.lang.String r2 = " is operatoring, please wait last operator complete"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.w(r8, r0)
            if (r1 != r14) goto L166
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_TAG_OPERATORING
            goto L168
        L166:
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_ALIAS_OPERATORING
        L168:
            a(r10, r1, r0, r4)
            return
        L16c:
            if (r12 == 0) goto L19a
            if (r1 != r15) goto L19a
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L18e
            cn.jpush.android.ab.c r0 = cn.jpush.android.ab.c.a()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r11.pros
            r20 = r4
            r5 = r2
            r2 = r3
            r3 = r20
            r0.a(r1, r2, r3, r5, r6, r7)
            r6 = r2
            r4 = r3
            r2 = r1
        L18c:
            r0 = 4
            goto L19d
        L18e:
            r2 = r1
            java.lang.String r0 = "pros is operatoring, please wait last operator complete"
            cn.jpush.android.helper.Logger.w(r8, r0)
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_PROPERTIES_OPERATORING
            a(r10, r2, r0, r4)
            return
        L19a:
            r2 = r1
            r6 = r3
            goto L18c
        L19d:
            if (r2 != r0) goto L1ca
            cn.jpush.android.ab.c r1 = cn.jpush.android.ab.c.a()
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L1bd
            r1 = r12
            cn.jpush.android.ab.c r12 = cn.jpush.android.ab.c.a()
            r18 = 0
            r19 = 0
            r17 = 0
            r13 = r2
            r15 = r4
            r14 = r6
            r0 = 3
            r2 = 4
            r12.a(r13, r14, r15, r17, r18, r19)
            goto L1ce
        L1bd:
            r13 = r2
            java.lang.String r0 = "push status is operatoring, please wait last operator complete"
            cn.jpush.android.helper.Logger.w(r8, r0)
            int r3 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_PROPERTIES_OPERATORING
            r1 = r10
            a(r1, r2, r3, r4, r6)
            return
        L1ca:
            r13 = r2
            r1 = r12
            r0 = 3
            r2 = 4
        L1ce:
            if (r13 != r0) goto L1d6
            int r0 = r11.action
            a(r10, r4, r1, r0)
            goto L1e1
        L1d6:
            if (r13 != r2) goto L1de
            int r0 = r11.action
            a(r10, r4, r0)
            goto L1e1
        L1de:
            a(r10, r13, r4, r1)
        L1e1:
            return
    }

    public static void a(android.content.Context r4, java.lang.String r5, java.util.Set<java.lang.String> r6, cn.jpush.android.api.CallBackParams r7) {
            long r0 = cn.jpush.android.helper.f.a()
            if (r7 == 0) goto L11
            cn.jpush.android.ab.d r2 = cn.jpush.android.ab.d.a()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.a(r4, r3, r7)
        L11:
            boolean r2 = r4 instanceof android.app.Application
            if (r2 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
        L1d:
            if (r7 == 0) goto L2a
            int r2 = r7.protoType
            if (r2 != 0) goto L2a
            cn.jpush.android.ab.d r2 = cn.jpush.android.ab.d.a()
            r2.a(r4)
        L2a:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "alias"
            r2.putString(r3, r5)
            if (r6 == 0) goto L3c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            goto L3d
        L3c:
            r5 = 0
        L3d:
            java.lang.String r6 = "tags"
            r2.putStringArrayList(r6, r5)
            if (r7 == 0) goto L55
            int r5 = r7.protoType
            r6 = 3
            if (r5 != r6) goto L4d
            java.util.Map<java.lang.String, java.lang.Object> r6 = r7.pros
            if (r6 != 0) goto L50
        L4d:
            r6 = 4
            if (r5 != r6) goto L55
        L50:
            java.lang.String r5 = "callback"
            r2.putSerializable(r5, r7)
        L55:
            java.lang.String r5 = "seq"
            r2.putLong(r5, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 0
            if (r7 == 0) goto L65
            int r0 = r7.protoType
            goto L66
        L65:
            r0 = 0
        L66:
            r5.append(r0)
            java.lang.String r0 = ""
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "proto_type"
            r2.putString(r1, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r7 == 0) goto L80
            int r6 = r7.action
        L80:
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "action_type"
            r2.putString(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "setAliasAndTags bundle="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.d(r6, r5)
            java.lang.String r5 = "JPUSH"
            java.lang.String r6 = "tagalis"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r4, r5, r6, r2)
            return
    }

    private static boolean a(int r1, int r2) {
            r0 = 1
            if (r1 != r0) goto Lf
            if (r2 == r0) goto Le
            r1 = 2
            if (r2 == r1) goto Le
            r1 = 3
            if (r2 == r1) goto Le
            r1 = 6
            if (r2 != r1) goto Lf
        Le:
            return r0
        Lf:
            r1 = 0
            return r1
    }

    private static boolean a(android.content.Context r3, int r4, java.lang.String r5, long r6) {
            int r0 = cn.jpush.android.ad.h.b(r5)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid alias: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", will not set alias this time."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.dd(r1, r5)
            a(r3, r4, r0, r6)
            r3 = 0
            return r3
        L26:
            r3 = 1
            return r3
    }

    private static boolean a(android.content.Context r2, int r3, java.util.Set<java.lang.String> r4, long r5) {
            int r4 = cn.jpush.android.ad.h.a(r4)
            if (r4 == 0) goto L12
            java.lang.String r0 = "TagAliasHelper"
            java.lang.String r1 = "Invalid tags, will not set tags this time."
            cn.jpush.android.helper.Logger.dd(r0, r1)
            a(r2, r3, r4, r5)
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    private static boolean a(java.lang.String r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto Ld
            byte[] r3 = r3.getBytes()
            int r3 = r3.length
            goto Le
        Ld:
            r3 = 0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "tags length:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.v(r2, r0)
            r0 = 1
            if (r4 == 0) goto L2d
            r4 = 5000(0x1388, float:7.006E-42)
            if (r3 > r4) goto L2c
            return r0
        L2c:
            return r1
        L2d:
            r4 = 7000(0x1b58, float:9.809E-42)
            if (r3 > r4) goto L32
            return r0
        L32:
            return r1
    }

    private static java.lang.String b(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            java.lang.String r0 = "valid"
            return r0
        L9:
            java.lang.String r0 = "get"
            return r0
        Lc:
            java.lang.String r0 = "clean"
            return r0
        Lf:
            java.lang.String r0 = "del"
            return r0
        L12:
            java.lang.String r0 = "set"
            return r0
        L15:
            java.lang.String r0 = "add"
            return r0
    }

    public static java.lang.String b(java.util.Set<java.lang.String> r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Ld
            java.lang.String r5 = ""
            return r5
        Ld:
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L4a
            boolean r3 = cn.jpush.android.ad.h.a(r2)
            if (r3 == 0) goto L4a
            if (r0 != 0) goto L2d
            goto L41
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ","
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L41:
            int r1 = r1 + 1
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r0) goto L48
            return r2
        L48:
            r0 = r2
            goto L12
        L4a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid tag: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.ee(r3, r2)
            goto L12
        L61:
            return r0
    }

    private static boolean b(int r1, int r2) {
            r0 = 2
            if (r1 != r0) goto L7
            if (r2 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private static boolean b(android.content.Context r3, java.lang.String r4, long r5, int r7) {
            r0 = 1
            if (r4 == 0) goto L3f
            java.lang.String r1 = ","
            java.lang.String r2 = ""
            java.lang.String r4 = r4.replaceAll(r1, r2)
            r1 = 0
            if (r7 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            boolean r4 = a(r4, r2)
            if (r4 != 0) goto L3f
            int r4 = cn.jpush.android.api.JPushInterface.ErrorCode.TOO_LONG_TAGALIAS
            a(r3, r7, r4, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The length of tags should be less than "
            r3.append(r4)
            if (r7 == 0) goto L2b
            r4 = 5000(0x1388, float:7.006E-42)
            goto L2d
        L2b:
            r4 = 7000(0x1b58, float:9.809E-42)
        L2d:
            r3.append(r4)
            java.lang.String r4 = " bytes."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TagAliasHelper"
            cn.jpush.android.helper.Logger.ww(r4, r3)
            return r1
        L3f:
            return r0
    }

    private static boolean c(int r1) {
            r0 = 2
            if (r1 == r0) goto Lc
            r0 = 3
            if (r1 == r0) goto Lc
            r0 = 5
            if (r1 != r0) goto La
            goto Lc
        La:
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
    }

    private static boolean d(int r2) {
            r0 = 1
            if (r2 == 0) goto Lb
            if (r2 == r0) goto Lb
            r1 = 2
            if (r2 != r1) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            return r0
    }
}
