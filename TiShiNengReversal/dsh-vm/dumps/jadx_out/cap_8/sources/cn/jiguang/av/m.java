package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(org.json.JSONObject r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            return r1
        L5:
            r0 = 2
            java.lang.String r1 = r1.toString(r0)     // Catch: org.json.JSONException -> Lb
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static org.json.JSONObject a(org.json.JSONObject r3, java.util.Set<java.lang.String> r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r4 == 0) goto L28
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Le
            goto L28
        Le:
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.opt(r1)     // Catch: org.json.JSONException -> L26
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L26
            goto L12
        L26:
            goto L12
        L28:
            return r0
    }

    public static void a(org.json.JSONObject r3, org.json.JSONObject r4) {
            if (r4 == 0) goto L25
            int r0 = r4.length()
            if (r0 == 0) goto L25
            if (r3 != 0) goto Lb
            goto L25
        Lb:
            java.util.Iterator r0 = r4.keys()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.get(r1)     // Catch: org.json.JSONException -> L23
            r3.put(r1, r2)     // Catch: org.json.JSONException -> L23
            goto Lf
        L23:
            goto Lf
        L25:
            return
    }

    public static int b(org.json.JSONObject r2) {
            r0 = 0
            if (r2 == 0) goto L14
            int r1 = r2.length()
            if (r1 != 0) goto La
            goto L14
        La:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L14
            byte[] r2 = cn.jiguang.av.v.j(r2)     // Catch: java.lang.Throwable -> L14
            int r2 = r2.length     // Catch: java.lang.Throwable -> L14
            return r2
        L14:
            return r0
    }

    public static boolean c(org.json.JSONObject r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
