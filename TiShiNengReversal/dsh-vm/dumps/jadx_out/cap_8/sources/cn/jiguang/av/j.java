package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    private static java.util.HashMap<java.lang.Object, android.util.Pair<java.lang.Long, java.lang.Integer>> a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.av.j.a = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(java.lang.Object r1, long r2) {
            r0 = 0
            boolean r1 = a(r1, r2, r0)
            return r1
    }

    public static boolean a(java.lang.Object r10, long r11, int r13) {
            java.lang.String r0 = "ApiFrequency"
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 > 0) goto Lb
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
        Lb:
            if (r13 > 0) goto L10
            r13 = 2147483647(0x7fffffff, float:NaN)
        L10:
            r1 = 0
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L79
            java.util.HashMap<java.lang.Object, android.util.Pair<java.lang.Long, java.lang.Integer>> r4 = cn.jiguang.av.j.a     // Catch: java.lang.Throwable -> L79
            boolean r4 = r4.containsKey(r10)     // Catch: java.lang.Throwable -> L79
            r5 = 1
            if (r4 == 0) goto L7b
            java.util.HashMap<java.lang.Object, android.util.Pair<java.lang.Long, java.lang.Integer>> r4 = cn.jiguang.av.j.a     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L79
            android.util.Pair r4 = (android.util.Pair) r4     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L7b
            java.lang.Object r6 = r4.first     // Catch: java.lang.Throwable -> L79
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L79
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = r4.second     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L79
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L79
            long r6 = r2 - r6
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r8.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "check api frequency, functionName: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r10)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "; callApiInternalTimeLimit: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r11)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = ", diffInternalTime: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = "; callApiTimesLimit： "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r13)     // Catch: java.lang.Throwable -> L79
            java.lang.String r9 = ", currentApiCallTimes: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79
            r8.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L79
            cn.jiguang.w.f.c(r0, r8)     // Catch: java.lang.Throwable -> L79
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 <= 0) goto L78
            if (r4 < r13) goto L7c
        L78:
            return r5
        L79:
            r10 = move-exception
            goto L90
        L7b:
            r4 = 0
        L7c:
            android.util.Pair r11 = new android.util.Pair     // Catch: java.lang.Throwable -> L79
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L79
            int r4 = r4 + r5
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L79
            java.util.HashMap<java.lang.Object, android.util.Pair<java.lang.Long, java.lang.Integer>> r12 = cn.jiguang.av.j.a     // Catch: java.lang.Throwable -> L79
            r12.put(r10, r11)     // Catch: java.lang.Throwable -> L79
            goto La8
        L90:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "isFrequency failed: "
            r11.append(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.i(r0, r10)
        La8:
            return r1
    }
}
