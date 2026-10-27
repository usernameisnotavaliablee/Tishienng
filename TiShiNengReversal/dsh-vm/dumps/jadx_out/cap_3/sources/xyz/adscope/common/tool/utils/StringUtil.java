package xyz.adscope.common.tool.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StringUtil {
    public StringUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String ListToString(java.util.List<java.lang.String> r4) {
            if (r4 == 0) goto L40
            int r0 = r4.size()
            r1 = 1
            if (r0 >= r1) goto La
            goto L40
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        L15:
            int r2 = r4.size()
            if (r1 >= r2) goto L36
            if (r1 == 0) goto L22
            java.lang.String r2 = ","
            r0.append(r2)
        L22:
            java.lang.String r2 = "\""
            r0.append(r2)
            java.lang.Object r3 = r4.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            int r1 = r1 + 1
            goto L15
        L36:
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L40:
            r4 = 0
            return r4
    }

    public static int getRandomValue(int r1) {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r1)
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.String> mapStringToMap(java.lang.String r11) {
            java.lang.String r0 = "StringUtil"
            r1 = 0
            java.lang.String r2 = r11.trim()     // Catch: java.lang.Exception -> L4a
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L4a
            if (r2 == 0) goto Le
            return r1
        Le:
            int r2 = r11.length()     // Catch: java.lang.Exception -> L4a
            r3 = 2
            if (r2 < r3) goto L78
            int r2 = r11.length()     // Catch: java.lang.Exception -> L4a
            r4 = 1
            int r2 = r2 - r4
            java.lang.String r11 = r11.substring(r4, r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = ","
            java.lang.String[] r11 = r11.split(r2)     // Catch: java.lang.Exception -> L4a
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L4a
            r2.<init>()     // Catch: java.lang.Exception -> L4a
            int r5 = r11.length     // Catch: java.lang.Exception -> L4a
            r6 = 0
            r7 = 0
        L2d:
            if (r7 >= r5) goto L63
            r8 = r11[r7]     // Catch: java.lang.Exception -> L4a
            java.lang.String r9 = "="
            java.lang.String[] r9 = r8.split(r9)     // Catch: java.lang.Exception -> L4a
            int r10 = r9.length     // Catch: java.lang.Exception -> L4a
            if (r10 != r3) goto L4c
            r8 = r9[r6]     // Catch: java.lang.Exception -> L4a
            java.lang.String r8 = r8.trim()     // Catch: java.lang.Exception -> L4a
            r9 = r9[r4]     // Catch: java.lang.Exception -> L4a
            java.lang.String r9 = r9.trim()     // Catch: java.lang.Exception -> L4a
            r2.put(r8, r9)     // Catch: java.lang.Exception -> L4a
            goto L60
        L4a:
            r11 = move-exception
            goto L64
        L4c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r9.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r10 = "Invalid key-value pair: "
            r9.append(r10)     // Catch: java.lang.Exception -> L4a
            r9.append(r8)     // Catch: java.lang.Exception -> L4a
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Exception -> L4a
            xyz.adscope.common.tool.LogUtil.e(r0, r8)     // Catch: java.lang.Exception -> L4a
        L60:
            int r7 = r7 + 1
            goto L2d
        L63:
            return r2
        L64:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r11)
        L78:
            return r1
    }

    public static java.lang.String replaceM(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            return r1
    }

    public static java.lang.String replaceStr(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = replaceM(r1, r2, r0)
            return r1
    }

    public static float strToFloat(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L22
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "StringUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
        L22:
            r2 = 0
            return r2
    }

    public static int strToInt(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L22
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "StringUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
        L22:
            r2 = 0
            return r2
    }
}
