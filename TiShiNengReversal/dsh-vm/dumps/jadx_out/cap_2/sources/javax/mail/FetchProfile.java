package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FetchProfile {
    private java.util.Vector headers;
    private java.util.Vector specials;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Item {
        public static final javax.mail.FetchProfile.Item CONTENT_INFO = null;
        public static final javax.mail.FetchProfile.Item ENVELOPE = null;
        public static final javax.mail.FetchProfile.Item FLAGS = null;
        private java.lang.String name;

        static {
                javax.mail.FetchProfile$Item r0 = new javax.mail.FetchProfile$Item
                java.lang.String r1 = "ENVELOPE"
                r0.<init>(r1)
                javax.mail.FetchProfile.Item.ENVELOPE = r0
                javax.mail.FetchProfile$Item r0 = new javax.mail.FetchProfile$Item
                java.lang.String r1 = "CONTENT_INFO"
                r0.<init>(r1)
                javax.mail.FetchProfile.Item.CONTENT_INFO = r0
                javax.mail.FetchProfile$Item r0 = new javax.mail.FetchProfile$Item
                java.lang.String r1 = "FLAGS"
                r0.<init>(r1)
                javax.mail.FetchProfile.Item.FLAGS = r0
                return
        }

        protected Item(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }
    }

    public FetchProfile() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.specials = r0
            r1.headers = r0
            return
    }

    public void add(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.headers
            if (r0 != 0) goto Lb
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.headers = r0
        Lb:
            java.util.Vector r0 = r1.headers
            r0.addElement(r2)
            return
    }

    public void add(javax.mail.FetchProfile.Item r2) {
            r1 = this;
            java.util.Vector r0 = r1.specials
            if (r0 != 0) goto Lb
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.specials = r0
        Lb:
            java.util.Vector r0 = r1.specials
            r0.addElement(r2)
            return
    }

    public boolean contains(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.headers
            if (r0 == 0) goto Lc
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public boolean contains(javax.mail.FetchProfile.Item r2) {
            r1 = this;
            java.util.Vector r0 = r1.specials
            if (r0 == 0) goto Lc
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public java.lang.String[] getHeaderNames() {
            r2 = this;
            java.util.Vector r0 = r2.headers
            if (r0 != 0) goto L8
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
        L8:
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Vector r1 = r2.headers
            r1.copyInto(r0)
            return r0
    }

    public javax.mail.FetchProfile.Item[] getItems() {
            r2 = this;
            java.util.Vector r0 = r2.specials
            if (r0 != 0) goto L8
            r0 = 0
            javax.mail.FetchProfile$Item[] r0 = new javax.mail.FetchProfile.Item[r0]
            return r0
        L8:
            int r0 = r0.size()
            javax.mail.FetchProfile$Item[] r0 = new javax.mail.FetchProfile.Item[r0]
            java.util.Vector r1 = r2.specials
            r1.copyInto(r0)
            return r0
    }
}
