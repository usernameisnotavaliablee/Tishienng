package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class Quota {
    public java.lang.String quotaRoot;
    public javax.mail.Quota.Resource[] resources;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Resource {
        public long limit;
        public java.lang.String name;
        public long usage;

        public Resource(java.lang.String r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.usage = r2
                r0.limit = r4
                return
        }
    }

    public Quota(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.quotaRoot = r1
            return
    }

    public void setResourceLimit(java.lang.String r10, long r11) {
            r9 = this;
            javax.mail.Quota$Resource[] r0 = r9.resources
            r1 = 0
            if (r0 != 0) goto L16
            r0 = 1
            javax.mail.Quota$Resource[] r0 = new javax.mail.Quota.Resource[r0]
            r9.resources = r0
            javax.mail.Quota$Resource r2 = new javax.mail.Quota$Resource
            r4 = 0
            r3 = r10
            r6 = r11
            r2.<init>(r3, r4, r6)
            r0[r1] = r2
            return
        L16:
            r3 = r10
            r6 = r11
            r10 = 0
        L19:
            javax.mail.Quota$Resource[] r11 = r9.resources
            int r12 = r11.length
            if (r10 < r12) goto L35
            int r10 = r11.length
            int r12 = r10 + 1
            javax.mail.Quota$Resource[] r12 = new javax.mail.Quota.Resource[r12]
            int r0 = r11.length
            java.lang.System.arraycopy(r11, r1, r12, r1, r0)
            r4 = r3
            javax.mail.Quota$Resource r3 = new javax.mail.Quota$Resource
            r7 = r6
            r5 = 0
            r3.<init>(r4, r5, r7)
            r12[r10] = r3
            r9.resources = r12
            return
        L35:
            r11 = r11[r10]
            java.lang.String r11 = r11.name
            boolean r11 = r11.equalsIgnoreCase(r3)
            if (r11 == 0) goto L46
            javax.mail.Quota$Resource[] r11 = r9.resources
            r10 = r11[r10]
            r10.limit = r6
            return
        L46:
            int r10 = r10 + 1
            goto L19
    }
}
