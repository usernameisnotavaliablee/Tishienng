package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class Provider {
    private java.lang.String className;
    private java.lang.String protocol;
    private javax.mail.Provider.Type type;
    private java.lang.String vendor;
    private java.lang.String version;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Type {
        public static final javax.mail.Provider.Type STORE = null;
        public static final javax.mail.Provider.Type TRANSPORT = null;
        private java.lang.String type;

        static {
                javax.mail.Provider$Type r0 = new javax.mail.Provider$Type
                java.lang.String r1 = "STORE"
                r0.<init>(r1)
                javax.mail.Provider.Type.STORE = r0
                javax.mail.Provider$Type r0 = new javax.mail.Provider$Type
                java.lang.String r1 = "TRANSPORT"
                r0.<init>(r1)
                javax.mail.Provider.Type.TRANSPORT = r0
                return
        }

        private Type(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.type
                return r0
        }
    }

    public Provider(javax.mail.Provider.Type r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.protocol = r2
            r0.className = r3
            r0.vendor = r4
            r0.version = r5
            return
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public java.lang.String getProtocol() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }

    public javax.mail.Provider.Type getType() {
            r1 = this;
            javax.mail.Provider$Type r0 = r1.type
            return r0
    }

    public java.lang.String getVendor() {
            r1 = this;
            java.lang.String r0 = r1.vendor
            return r0
    }

    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.version
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "javax.mail.Provider["
            r0.<init>(r1)
            javax.mail.Provider$Type r1 = r3.type
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.lang.String r2 = r3.protocol
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.className
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r3.vendor
            if (r2 == 0) goto L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = r3.vendor
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L3b:
            java.lang.String r2 = r3.version
            if (r2 == 0) goto L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = r3.version
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
