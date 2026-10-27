package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class UniqueValue {
    private static int id;

    static {
            return
    }

    UniqueValue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getUniqueBoundaryValue() {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "----=_Part_"
            r0.append(r1)
            int r1 = getUniqueId()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            int r1 = r0.hashCode()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static synchronized int getUniqueId() {
            java.lang.Class<javax.mail.internet.UniqueValue> r0 = javax.mail.internet.UniqueValue.class
            monitor-enter(r0)
            int r1 = javax.mail.internet.UniqueValue.id     // Catch: java.lang.Throwable -> Lb
            int r2 = r1 + 1
            javax.mail.internet.UniqueValue.id = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static java.lang.String getUniqueMessageIDValue(javax.mail.Session r4) {
            javax.mail.internet.InternetAddress r4 = javax.mail.internet.InternetAddress.getLocalAddress(r4)
            if (r4 == 0) goto Lb
            java.lang.String r4 = r4.getAddress()
            goto Ld
        Lb:
            java.lang.String r4 = "javamailuser@localhost"
        Ld:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r0.hashCode()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = getUniqueId()
            r0.append(r2)
            r0.append(r1)
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "JavaMail."
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
