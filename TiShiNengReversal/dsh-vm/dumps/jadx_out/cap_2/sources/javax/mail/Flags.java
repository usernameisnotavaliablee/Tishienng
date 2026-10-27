package javax.mail;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class Flags implements java.lang.Cloneable, java.io.Serializable {
    private static final int ANSWERED_BIT = 1;
    private static final int DELETED_BIT = 2;
    private static final int DRAFT_BIT = 4;
    private static final int FLAGGED_BIT = 8;
    private static final int RECENT_BIT = 16;
    private static final int SEEN_BIT = 32;
    private static final int USER_BIT = Integer.MIN_VALUE;
    private static final long serialVersionUID = 6243590407214169028L;
    private int system_flags;
    private java.util.Hashtable user_flags;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Flag {
        public static final javax.mail.Flags.Flag ANSWERED = null;
        public static final javax.mail.Flags.Flag DELETED = null;
        public static final javax.mail.Flags.Flag DRAFT = null;
        public static final javax.mail.Flags.Flag FLAGGED = null;
        public static final javax.mail.Flags.Flag RECENT = null;
        public static final javax.mail.Flags.Flag SEEN = null;
        public static final javax.mail.Flags.Flag USER = null;
        private int bit;

        static {
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = 1
                r0.<init>(r1)
                javax.mail.Flags.Flag.ANSWERED = r0
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = 2
                r0.<init>(r1)
                javax.mail.Flags.Flag.DELETED = r0
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = 4
                r0.<init>(r1)
                javax.mail.Flags.Flag.DRAFT = r0
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = 8
                r0.<init>(r1)
                javax.mail.Flags.Flag.FLAGGED = r0
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = 16
                r0.<init>(r1)
                javax.mail.Flags.Flag.RECENT = r0
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = 32
                r0.<init>(r1)
                javax.mail.Flags.Flag.SEEN = r0
                javax.mail.Flags$Flag r0 = new javax.mail.Flags$Flag
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.<init>(r1)
                javax.mail.Flags.Flag.USER = r0
                return
        }

        private Flag(int r1) {
                r0 = this;
                r0.<init>()
                r0.bit = r1
                return
        }

        static /* synthetic */ int access$0(javax.mail.Flags.Flag r0) {
                int r0 = r0.bit
                return r0
        }
    }

    public Flags() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.system_flags = r0
            r0 = 0
            r1.user_flags = r0
            return
    }

    public Flags(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.system_flags = r0
            r0 = 0
            r2.user_flags = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 1
            r0.<init>(r1)
            r2.user_flags = r0
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r3.toLowerCase(r1)
            r0.put(r1, r3)
            return
    }

    public Flags(javax.mail.Flags.Flag r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.system_flags = r0
            r0 = 0
            r1.user_flags = r0
            int r2 = javax.mail.Flags.Flag.access$0(r2)
            r1.system_flags = r2
            return
    }

    public Flags(javax.mail.Flags r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.system_flags = r0
            r0 = 0
            r1.user_flags = r0
            int r0 = r2.system_flags
            r1.system_flags = r0
            java.util.Hashtable r2 = r2.user_flags
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.clone()
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            r1.user_flags = r2
        L19:
            return
    }

    public void add(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.user_flags
            if (r0 != 0) goto Lc
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 1
            r0.<init>(r1)
            r2.user_flags = r0
        Lc:
            java.util.Hashtable r0 = r2.user_flags
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r3.toLowerCase(r1)
            r0.put(r1, r3)
            return
    }

    public void add(javax.mail.Flags.Flag r2) {
            r1 = this;
            int r0 = r1.system_flags
            int r2 = javax.mail.Flags.Flag.access$0(r2)
            r2 = r2 | r0
            r1.system_flags = r2
            return
    }

    public void add(javax.mail.Flags r5) {
            r4 = this;
            int r0 = r4.system_flags
            int r1 = r5.system_flags
            r0 = r0 | r1
            r4.system_flags = r0
            java.util.Hashtable r0 = r5.user_flags
            if (r0 == 0) goto L36
            java.util.Hashtable r0 = r4.user_flags
            if (r0 != 0) goto L17
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 1
            r0.<init>(r1)
            r4.user_flags = r0
        L17:
            java.util.Hashtable r0 = r5.user_flags
            java.util.Enumeration r0 = r0.keys()
        L1d:
            boolean r1 = r0.hasMoreElements()
            if (r1 != 0) goto L24
            goto L36
        L24:
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Hashtable r2 = r4.user_flags
            java.util.Hashtable r3 = r5.user_flags
            java.lang.Object r3 = r3.get(r1)
            r2.put(r1, r3)
            goto L1d
        L36:
            return
    }

    public java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            javax.mail.Flags r0 = (javax.mail.Flags) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            java.util.Hashtable r1 = r2.user_flags
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            java.lang.Object r1 = r1.clone()
            java.util.Hashtable r1 = (java.util.Hashtable) r1
            r0.user_flags = r1
        L16:
            return r0
    }

    public boolean contains(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.user_flags
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            boolean r3 = r0.containsKey(r3)
            return r3
    }

    public boolean contains(javax.mail.Flags.Flag r2) {
            r1 = this;
            int r0 = r1.system_flags
            int r2 = javax.mail.Flags.Flag.access$0(r2)
            r2 = r2 & r0
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public boolean contains(javax.mail.Flags r4) {
            r3 = this;
            int r0 = r4.system_flags
            int r1 = r3.system_flags
            r1 = r1 & r0
            r2 = 0
            if (r1 == r0) goto L9
            return r2
        L9:
            java.util.Hashtable r4 = r4.user_flags
            if (r4 == 0) goto L2a
            java.util.Hashtable r0 = r3.user_flags
            if (r0 != 0) goto L12
            return r2
        L12:
            java.util.Enumeration r4 = r4.keys()
        L16:
            boolean r0 = r4.hasMoreElements()
            if (r0 != 0) goto L1d
            goto L2a
        L1d:
            java.util.Hashtable r0 = r3.user_flags
            java.lang.Object r1 = r4.nextElement()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L16
            return r2
        L2a:
            r4 = 1
            return r4
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof javax.mail.Flags
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.Flags r5 = (javax.mail.Flags) r5
            int r0 = r5.system_flags
            int r2 = r4.system_flags
            if (r0 == r2) goto Lf
            return r1
        Lf:
            java.util.Hashtable r0 = r5.user_flags
            r2 = 1
            if (r0 != 0) goto L19
            java.util.Hashtable r3 = r4.user_flags
            if (r3 != 0) goto L19
            return r2
        L19:
            if (r0 == 0) goto L44
            java.util.Hashtable r3 = r4.user_flags
            if (r3 == 0) goto L44
            int r0 = r0.size()
            java.util.Hashtable r3 = r4.user_flags
            int r3 = r3.size()
            if (r0 != r3) goto L44
            java.util.Hashtable r5 = r5.user_flags
            java.util.Enumeration r5 = r5.keys()
        L31:
            boolean r0 = r5.hasMoreElements()
            if (r0 != 0) goto L38
            return r2
        L38:
            java.util.Hashtable r0 = r4.user_flags
            java.lang.Object r3 = r5.nextElement()
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L31
        L44:
            return r1
    }

    public javax.mail.Flags.Flag[] getSystemFlags() {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r3.system_flags
            r1 = r1 & 1
            if (r1 == 0) goto L10
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.ANSWERED
            r0.addElement(r1)
        L10:
            int r1 = r3.system_flags
            r1 = r1 & 2
            if (r1 == 0) goto L1b
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.DELETED
            r0.addElement(r1)
        L1b:
            int r1 = r3.system_flags
            r1 = r1 & 4
            if (r1 == 0) goto L26
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.DRAFT
            r0.addElement(r1)
        L26:
            int r1 = r3.system_flags
            r1 = r1 & 8
            if (r1 == 0) goto L31
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.FLAGGED
            r0.addElement(r1)
        L31:
            int r1 = r3.system_flags
            r1 = r1 & 16
            if (r1 == 0) goto L3c
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.RECENT
            r0.addElement(r1)
        L3c:
            int r1 = r3.system_flags
            r1 = r1 & 32
            if (r1 == 0) goto L47
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.SEEN
            r0.addElement(r1)
        L47:
            int r1 = r3.system_flags
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L53
            javax.mail.Flags$Flag r1 = javax.mail.Flags.Flag.USER
            r0.addElement(r1)
        L53:
            int r1 = r0.size()
            javax.mail.Flags$Flag[] r1 = new javax.mail.Flags.Flag[r1]
            r0.copyInto(r1)
            return r1
    }

    public java.lang.String[] getUserFlags() {
            r3 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            java.util.Hashtable r1 = r3.user_flags
            if (r1 == 0) goto L1c
            java.util.Enumeration r1 = r1.elements()
        Ld:
            boolean r2 = r1.hasMoreElements()
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.lang.Object r2 = r1.nextElement()
            r0.addElement(r2)
            goto Ld
        L1c:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.copyInto(r1)
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.system_flags
            java.util.Hashtable r1 = r3.user_flags
            if (r1 == 0) goto L1d
            java.util.Enumeration r1 = r1.keys()
        La:
            boolean r2 = r1.hasMoreElements()
            if (r2 != 0) goto L11
            return r0
        L11:
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto La
        L1d:
            return r0
    }

    public void remove(java.lang.String r3) {
            r2 = this;
            java.util.Hashtable r0 = r2.user_flags
            if (r0 == 0) goto Ld
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r1)
            r0.remove(r3)
        Ld:
            return
    }

    public void remove(javax.mail.Flags.Flag r2) {
            r1 = this;
            int r0 = r1.system_flags
            int r2 = javax.mail.Flags.Flag.access$0(r2)
            int r2 = ~r2
            r2 = r2 & r0
            r1.system_flags = r2
            return
    }

    public void remove(javax.mail.Flags r3) {
            r2 = this;
            int r0 = r2.system_flags
            int r1 = r3.system_flags
            int r1 = ~r1
            r0 = r0 & r1
            r2.system_flags = r0
            java.util.Hashtable r3 = r3.user_flags
            if (r3 == 0) goto L26
            java.util.Hashtable r0 = r2.user_flags
            if (r0 != 0) goto L11
            goto L26
        L11:
            java.util.Enumeration r3 = r3.keys()
        L15:
            boolean r0 = r3.hasMoreElements()
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.util.Hashtable r0 = r2.user_flags
            java.lang.Object r1 = r3.nextElement()
            r0.remove(r1)
            goto L15
        L26:
            return
    }
}
