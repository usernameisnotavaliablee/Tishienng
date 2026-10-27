package cn.jiguang.commons.e;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class l {
    private static long a;

    static {
            return
    }

    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONObject a(android.os.Bundle r3) {
            java.lang.String r0 = "JCmdUtils"
            java.lang.String r1 = "RESPONSE_BODY"
            byte[] r3 = r3.getByteArray(r1)     // Catch: java.lang.Exception -> L3c
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch: java.lang.Exception -> L3c
            long r1 = r3.getLong()     // Catch: java.lang.Exception -> L3c
            cn.jiguang.commons.e.l.a = r1     // Catch: java.lang.Exception -> L3c
            short r1 = r3.getShort()     // Catch: java.lang.Exception -> L3c
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L3c
            r3.get(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "UTF-8"
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "parseBundle2Json content: "
            r1.append(r2)     // Catch: java.lang.Exception -> L3c
            r1.append(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3c
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L3c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r1.<init>(r3)     // Catch: java.lang.Exception -> L3c
            return r1
        L3c:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parseBundle2Json exception:"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r3)
            r3 = 0
            return r3
    }
}
