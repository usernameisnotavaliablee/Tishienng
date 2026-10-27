package com.baidu.idl.face.platform.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LogHelper {
    private static final java.lang.String TAG = "LogHelper";
    private static java.util.ArrayList<java.lang.Integer> logLivenessLiveness;
    private static java.util.HashMap<java.lang.String, java.lang.Object> logMap;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> logTipsMap;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logMap = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logTipsMap = r0
            return
    }

    public LogHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addLivenessLog(int r2) {
            java.util.ArrayList<java.lang.Integer> r0 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness
            if (r0 == 0) goto L17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L17
            java.util.ArrayList<java.lang.Integer> r0 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L17:
            return
    }

    public static void addLog(java.lang.String r1, java.lang.Object r2) {
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.baidu.idl.face.platform.common.LogHelper.logMap
            if (r0 == 0) goto L7
            r0.put(r1, r2)
        L7:
            return
    }

    public static void addLogWithKey(java.lang.String r1, java.lang.Object r2) {
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.baidu.idl.face.platform.common.LogHelper.logMap
            if (r0 == 0) goto Lf
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto Lf
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.baidu.idl.face.platform.common.LogHelper.logMap
            r0.put(r1, r2)
        Lf:
            return
    }

    public static void addTipsLogWithKey(java.lang.String r2) {
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap
            r1 = 1
            if (r0 == 0) goto L15
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L15
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            return
        L15:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap
            if (r0 == 0) goto L35
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L35
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
        L35:
            return
    }

    public static void clear() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logMap = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logTipsMap = r0
            return
    }

    private static java.lang.String getLog() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{"
            r0.append(r1)     // Catch: java.lang.Exception -> L139
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = com.baidu.idl.face.platform.common.LogHelper.logMap     // Catch: java.lang.Exception -> L139
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L139
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L139
            r2 = 0
            r3 = 0
        L16:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> L139
            java.lang.String r5 = ","
            if (r4 == 0) goto Ld0
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> L139
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Exception -> L139
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = com.baidu.idl.face.platform.common.LogHelper.logMap     // Catch: java.lang.Exception -> L139
            int r6 = r6.size()     // Catch: java.lang.Exception -> L139
            int r6 = r6 + (-1)
            java.lang.String r7 = ":"
            java.lang.String r8 = "'"
            java.lang.String r9 = ":'"
            if (r3 != r6) goto L7f
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Exception -> L139
            boolean r5 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L139
            if (r5 == 0) goto L5f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L139
            r5.<init>()     // Catch: java.lang.Exception -> L139
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Exception -> L139
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L139
            r5.append(r6)     // Catch: java.lang.Exception -> L139
            r5.append(r9)     // Catch: java.lang.Exception -> L139
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L139
            r5.append(r4)     // Catch: java.lang.Exception -> L139
            r5.append(r8)     // Catch: java.lang.Exception -> L139
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L139
            r0.append(r4)     // Catch: java.lang.Exception -> L139
            goto Lcc
        L5f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L139
            r5.<init>()     // Catch: java.lang.Exception -> L139
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Exception -> L139
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L139
            r5.append(r6)     // Catch: java.lang.Exception -> L139
            r5.append(r7)     // Catch: java.lang.Exception -> L139
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L139
            r5.append(r4)     // Catch: java.lang.Exception -> L139
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L139
            r0.append(r4)     // Catch: java.lang.Exception -> L139
            goto Lcc
        L7f:
            java.lang.Object r6 = r4.getValue()     // Catch: java.lang.Exception -> L139
            boolean r6 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L139
            if (r6 == 0) goto Laa
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L139
            r6.<init>()     // Catch: java.lang.Exception -> L139
            java.lang.Object r7 = r4.getKey()     // Catch: java.lang.Exception -> L139
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L139
            r6.append(r7)     // Catch: java.lang.Exception -> L139
            r6.append(r9)     // Catch: java.lang.Exception -> L139
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L139
            r6.append(r4)     // Catch: java.lang.Exception -> L139
            r6.append(r8)     // Catch: java.lang.Exception -> L139
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L139
            r0.append(r4)     // Catch: java.lang.Exception -> L139
            goto Lc9
        Laa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L139
            r6.<init>()     // Catch: java.lang.Exception -> L139
            java.lang.Object r8 = r4.getKey()     // Catch: java.lang.Exception -> L139
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L139
            r6.append(r8)     // Catch: java.lang.Exception -> L139
            r6.append(r7)     // Catch: java.lang.Exception -> L139
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L139
            r6.append(r4)     // Catch: java.lang.Exception -> L139
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L139
            r0.append(r4)     // Catch: java.lang.Exception -> L139
        Lc9:
            r0.append(r5)     // Catch: java.lang.Exception -> L139
        Lcc:
            int r3 = r3 + 1
            goto L16
        Ld0:
            java.util.ArrayList<java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness     // Catch: java.lang.Exception -> L139
            if (r1 == 0) goto L11b
            int r1 = r1.size()     // Catch: java.lang.Exception -> L139
            if (r1 <= 0) goto L11b
            java.lang.String r1 = ",lv:["
            r0.append(r1)     // Catch: java.lang.Exception -> L139
        Ldf:
            java.util.ArrayList<java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness     // Catch: java.lang.Exception -> L139
            int r1 = r1.size()     // Catch: java.lang.Exception -> L139
            if (r2 >= r1) goto L116
            java.util.ArrayList<java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness     // Catch: java.lang.Exception -> L139
            int r1 = r1.size()     // Catch: java.lang.Exception -> L139
            int r1 = r1 + (-1)
            if (r2 != r1) goto Lfb
            java.util.ArrayList<java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness     // Catch: java.lang.Exception -> L139
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L139
            r0.append(r1)     // Catch: java.lang.Exception -> L139
            goto L113
        Lfb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L139
            r1.<init>()     // Catch: java.lang.Exception -> L139
            java.util.ArrayList<java.lang.Integer> r3 = com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness     // Catch: java.lang.Exception -> L139
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L139
            r1.append(r3)     // Catch: java.lang.Exception -> L139
            r1.append(r5)     // Catch: java.lang.Exception -> L139
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L139
            r0.append(r1)     // Catch: java.lang.Exception -> L139
        L113:
            int r2 = r2 + 1
            goto Ldf
        L116:
            java.lang.String r1 = "]"
            r0.append(r1)     // Catch: java.lang.Exception -> L139
        L11b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap     // Catch: java.lang.Exception -> L139
            java.lang.String r2 = "}"
            if (r1 == 0) goto L136
            int r1 = r1.size()     // Catch: java.lang.Exception -> L139
            if (r1 <= 0) goto L136
            java.lang.String r1 = ",msg:{"
            r0.append(r1)     // Catch: java.lang.Exception -> L139
            java.lang.String r1 = getTipsMessage()     // Catch: java.lang.Exception -> L139
            r0.append(r1)     // Catch: java.lang.Exception -> L139
            r0.append(r2)     // Catch: java.lang.Exception -> L139
        L136:
            r0.append(r2)     // Catch: java.lang.Exception -> L139
        L139:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logMap = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logLivenessLiveness = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.baidu.idl.face.platform.common.LogHelper.logTipsMap = r1
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String getTipsKey(java.lang.String r1) {
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftEye
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "leftEyeOccusion"
            return r1
        Lf:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightEye
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L1e
            java.lang.String r1 = "rightEyeOccusion"
            return r1
        L1e:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionNose
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L2d
            java.lang.String r1 = "noseOccusion"
            return r1
        L2d:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionMouth
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L3c
            java.lang.String r1 = "mouthOccusion"
            return r1
        L3c:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftContour
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L4b
            java.lang.String r1 = "leftFaceOccusion"
            return r1
        L4b:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightContour
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L5a
            java.lang.String r1 = "rightFaceOccusion"
            return r1
        L5a:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionChinContour
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L69
            java.lang.String r1 = "chinOccusion"
            return r1
        L69:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePoorIllumination
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L78
            java.lang.String r1 = "lightUp"
            return r1
        L78:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeImageBlured
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L87
            java.lang.String r1 = "stayStill"
            return r1
        L87:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooFar
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L96
            java.lang.String r1 = "moveClose"
            return r1
        L96:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooClose
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto La5
            java.lang.String r1 = "moveFurther"
            return r1
        La5:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lb4
            java.lang.String r1 = "headUp"
            return r1
        Lb4:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lc3
            java.lang.String r1 = "headDown"
            return r1
        Lc3:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Ld2
            java.lang.String r1 = "turnLeft"
            return r1
        Ld2:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Le1
            java.lang.String r1 = "turnRight"
            return r1
        Le1:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            java.lang.String r0 = r0.name()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto Lfd
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeBeyondPreviewFrame
            java.lang.String r0 = r0.name()
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto Lfa
            goto Lfd
        Lfa:
            java.lang.String r1 = ""
            return r1
        Lfd:
            java.lang.String r1 = "moveFace"
            return r1
    }

    private static java.lang.String getTipsMessage() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = com.baidu.idl.face.platform.common.LogHelper.logTipsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = getTipsKey(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ":"
            r4.append(r3)
            java.lang.Object r2 = r2.getValue()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            goto Lf
        L4c:
            int r1 = r0.length()
            if (r1 <= 0) goto L5b
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.deleteCharAt(r1)
        L5b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void sendLog() {
            java.lang.String r0 = getLog()
            com.baidu.idl.face.platform.network.LogRequest.sendLogMessage(r0)
            return
    }
}
