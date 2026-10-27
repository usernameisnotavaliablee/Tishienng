package myjava.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class MimeTypeProcessor {
    private static myjava.awt.datatransfer.MimeTypeProcessor instance;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class MimeType implements java.lang.Cloneable, java.io.Serializable {
        private static final long serialVersionUID = -6693571907475992044L;
        private java.util.Hashtable<java.lang.String, java.lang.String> parameters;
        private java.lang.String primaryType;
        private java.lang.String subType;
        private java.util.Hashtable<java.lang.String, java.lang.Object> systemParameters;

        MimeType() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.primaryType = r0
                r1.subType = r0
                r1.parameters = r0
                r1.systemParameters = r0
                return
        }

        MimeType(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.primaryType = r1
                r0.subType = r2
                java.util.Hashtable r1 = new java.util.Hashtable
                r1.<init>()
                r0.parameters = r1
                java.util.Hashtable r1 = new java.util.Hashtable
                r1.<init>()
                r0.systemParameters = r1
                return
        }

        static /* synthetic */ java.util.Hashtable access$0(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r0) {
                java.util.Hashtable<java.lang.String, java.lang.String> r0 = r0.parameters
                return r0
        }

        static /* synthetic */ void access$1(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r0, java.lang.String r1) {
                r0.primaryType = r1
                return
        }

        static /* synthetic */ void access$2(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r0, java.lang.String r1) {
                r0.subType = r1
                return
        }

        static /* synthetic */ void access$3(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r0, java.util.Hashtable r1) {
                r0.parameters = r1
                return
        }

        static /* synthetic */ void access$4(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r0, java.util.Hashtable r1) {
                r0.systemParameters = r1
                return
        }

        void addParameter(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                if (r5 != 0) goto L3
                goto L28
            L3:
                r0 = 0
                char r0 = r5.charAt(r0)
                r1 = 34
                if (r0 != r1) goto L22
                int r0 = r5.length()
                r2 = 1
                int r0 = r0 - r2
                char r0 = r5.charAt(r0)
                if (r0 != r1) goto L22
                int r0 = r5.length()
                int r0 = r0 + (-2)
                java.lang.String r5 = r5.substring(r2, r0)
            L22:
                int r0 = r5.length()
                if (r0 != 0) goto L29
            L28:
                return
            L29:
                java.util.Hashtable<java.lang.String, java.lang.String> r0 = r3.parameters
                r0.put(r4, r5)
                return
        }

        void addSystemParameter(java.lang.String r2, java.lang.Object r3) {
                r1 = this;
                java.util.Hashtable<java.lang.String, java.lang.Object> r0 = r1.systemParameters
                r0.put(r2, r3)
                return
        }

        public java.lang.Object clone() {
                r3 = this;
                myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = new myjava.awt.datatransfer.MimeTypeProcessor$MimeType
                java.lang.String r1 = r3.primaryType
                java.lang.String r2 = r3.subType
                r0.<init>(r1, r2)
                java.util.Hashtable<java.lang.String, java.lang.String> r1 = r3.parameters
                java.lang.Object r1 = r1.clone()
                java.util.Hashtable r1 = (java.util.Hashtable) r1
                r0.parameters = r1
                java.util.Hashtable<java.lang.String, java.lang.Object> r1 = r3.systemParameters
                java.lang.Object r1 = r1.clone()
                java.util.Hashtable r1 = (java.util.Hashtable) r1
                r0.systemParameters = r1
                return r0
        }

        boolean equals(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = r1.getFullType()
                java.lang.String r2 = r2.getFullType()
                boolean r2 = r0.equals(r2)
                return r2
        }

        java.lang.String getFullType() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = r2.primaryType
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.<init>(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.lang.String r1 = r2.subType
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        java.lang.String getParameter(java.lang.String r2) {
                r1 = this;
                java.util.Hashtable<java.lang.String, java.lang.String> r0 = r1.parameters
                java.lang.Object r2 = r0.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                return r2
        }

        java.lang.String getPrimaryType() {
                r1 = this;
                java.lang.String r0 = r1.primaryType
                return r0
        }

        java.lang.String getSubType() {
                r1 = this;
                java.lang.String r0 = r1.subType
                return r0
        }

        java.lang.Object getSystemParameter(java.lang.String r2) {
                r1 = this;
                java.util.Hashtable<java.lang.String, java.lang.Object> r0 = r1.systemParameters
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        void removeParameter(java.lang.String r2) {
                r1 = this;
                java.util.Hashtable<java.lang.String, java.lang.String> r0 = r1.parameters
                r0.remove(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StringPosition {
        int i;

        private StringPosition() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.i = r0
                return
        }

        /* synthetic */ StringPosition(myjava.awt.datatransfer.MimeTypeProcessor.StringPosition r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private MimeTypeProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String assemble(myjava.awt.datatransfer.MimeTypeProcessor.MimeType r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getFullType()
            r0.append(r1)
            java.util.Hashtable r1 = myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$0(r5)
            java.util.Enumeration r1 = r1.keys()
        L14:
            boolean r2 = r1.hasMoreElements()
            if (r2 != 0) goto L1f
            java.lang.String r5 = r0.toString()
            return r5
        L1f:
            java.lang.Object r2 = r1.nextElement()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Hashtable r3 = myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$0(r5)
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "; "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = "=\""
            r0.append(r2)
            r0.append(r3)
            r2 = 34
            r0.append(r2)
            goto L14
    }

    private static int getNextMeaningfulIndex(java.lang.String r1, int r2) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r0 = r1.charAt(r2)
            boolean r0 = isMeaningfulChar(r0)
            if (r0 == 0) goto L11
            goto L14
        L11:
            int r2 = r2 + 1
            goto L0
        L14:
            return r2
    }

    private static boolean isMeaningfulChar(char r1) {
            r0 = 33
            if (r1 < r0) goto La
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static boolean isTSpecialChar(char r1) {
            r0 = 40
            if (r1 == r0) goto L3e
            r0 = 41
            if (r1 == r0) goto L3e
            r0 = 91
            if (r1 == r0) goto L3e
            r0 = 93
            if (r1 == r0) goto L3e
            r0 = 60
            if (r1 == r0) goto L3e
            r0 = 62
            if (r1 == r0) goto L3e
            r0 = 64
            if (r1 == r0) goto L3e
            r0 = 44
            if (r1 == r0) goto L3e
            r0 = 59
            if (r1 == r0) goto L3e
            r0 = 58
            if (r1 == r0) goto L3e
            r0 = 92
            if (r1 == r0) goto L3e
            r0 = 34
            if (r1 == r0) goto L3e
            r0 = 47
            if (r1 == r0) goto L3e
            r0 = 63
            if (r1 == r0) goto L3e
            r0 = 61
            if (r1 == r0) goto L3e
            r1 = 0
            return r1
        L3e:
            r1 = 1
            return r1
    }

    static myjava.awt.datatransfer.MimeTypeProcessor.MimeType parse(java.lang.String r3) {
            myjava.awt.datatransfer.MimeTypeProcessor r0 = myjava.awt.datatransfer.MimeTypeProcessor.instance
            if (r0 != 0) goto Lb
            myjava.awt.datatransfer.MimeTypeProcessor r0 = new myjava.awt.datatransfer.MimeTypeProcessor
            r0.<init>()
            myjava.awt.datatransfer.MimeTypeProcessor.instance = r0
        Lb:
            myjava.awt.datatransfer.MimeTypeProcessor$MimeType r0 = new myjava.awt.datatransfer.MimeTypeProcessor$MimeType
            r0.<init>()
            if (r3 == 0) goto L1e
            myjava.awt.datatransfer.MimeTypeProcessor$StringPosition r1 = new myjava.awt.datatransfer.MimeTypeProcessor$StringPosition
            r2 = 0
            r1.<init>(r2)
            retrieveType(r3, r0, r1)
            retrieveParams(r3, r0, r1)
        L1e:
            return r0
    }

    private static void retrieveParam(java.lang.String r3, myjava.awt.datatransfer.MimeTypeProcessor.MimeType r4, myjava.awt.datatransfer.MimeTypeProcessor.StringPosition r5) {
            java.lang.String r0 = retrieveToken(r3, r5)
            java.lang.String r0 = r0.toLowerCase()
            int r1 = r5.i
            int r1 = getNextMeaningfulIndex(r3, r1)
            r5.i = r1
            int r2 = r3.length()
            if (r1 >= r2) goto L53
            int r1 = r5.i
            char r1 = r3.charAt(r1)
            r2 = 61
            if (r1 != r2) goto L53
            int r1 = r5.i
            int r1 = r1 + 1
            r5.i = r1
            int r1 = getNextMeaningfulIndex(r3, r1)
            r5.i = r1
            int r2 = r3.length()
            if (r1 >= r2) goto L4d
            int r1 = r5.i
            char r1 = r3.charAt(r1)
            r2 = 34
            if (r1 != r2) goto L41
            java.lang.String r3 = retrieveQuoted(r3, r5)
            goto L45
        L41:
            java.lang.String r3 = retrieveToken(r3, r5)
        L45:
            java.util.Hashtable r4 = myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$0(r4)
            r4.put(r0, r3)
            return
        L4d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L53:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    private static void retrieveParams(java.lang.String r2, myjava.awt.datatransfer.MimeTypeProcessor.MimeType r3, myjava.awt.datatransfer.MimeTypeProcessor.StringPosition r4) {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$3(r3, r0)
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$4(r3, r0)
        L10:
            int r0 = r4.i
            int r0 = getNextMeaningfulIndex(r2, r0)
            r4.i = r0
            int r1 = r2.length()
            if (r0 < r1) goto L1f
            return
        L1f:
            int r0 = r4.i
            char r0 = r2.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L33
            int r0 = r4.i
            int r0 = r0 + 1
            r4.i = r0
            retrieveParam(r2, r3, r4)
            goto L10
        L33:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    private static java.lang.String retrieveQuoted(java.lang.String r5, myjava.awt.datatransfer.MimeTypeProcessor.StringPosition r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.i
            r2 = 1
            int r1 = r1 + r2
            r6.i = r1
            r1 = 1
        Lc:
            int r3 = r6.i
            char r3 = r5.charAt(r3)
            r4 = 34
            if (r3 != r4) goto L22
            if (r1 == 0) goto L22
            int r5 = r6.i
            int r5 = r5 + r2
            r6.i = r5
            java.lang.String r5 = r0.toString()
            return r5
        L22:
            int r3 = r6.i
            int r4 = r3 + 1
            r6.i = r4
            char r3 = r5.charAt(r3)
            if (r1 != 0) goto L30
            r1 = 1
            goto L35
        L30:
            r4 = 92
            if (r3 != r4) goto L35
            r1 = 0
        L35:
            if (r1 == 0) goto L3a
            r0.append(r3)
        L3a:
            int r3 = r6.i
            int r4 = r5.length()
            if (r3 == r4) goto L43
            goto Lc
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    private static java.lang.String retrieveToken(java.lang.String r3, myjava.awt.datatransfer.MimeTypeProcessor.StringPosition r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.i
            int r1 = getNextMeaningfulIndex(r3, r1)
            r4.i = r1
            int r2 = r3.length()
            if (r1 >= r2) goto L51
            int r1 = r4.i
            char r1 = r3.charAt(r1)
            boolean r1 = isTSpecialChar(r1)
            if (r1 != 0) goto L51
        L1f:
            int r1 = r4.i
            int r2 = r1 + 1
            r4.i = r2
            char r1 = r3.charAt(r1)
            r0.append(r1)
            int r1 = r4.i
            int r2 = r3.length()
            if (r1 >= r2) goto L4c
            int r1 = r4.i
            char r1 = r3.charAt(r1)
            boolean r1 = isMeaningfulChar(r1)
            if (r1 == 0) goto L4c
            int r1 = r4.i
            char r1 = r3.charAt(r1)
            boolean r1 = isTSpecialChar(r1)
            if (r1 == 0) goto L1f
        L4c:
            java.lang.String r3 = r0.toString()
            return r3
        L51:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    private static void retrieveType(java.lang.String r2, myjava.awt.datatransfer.MimeTypeProcessor.MimeType r3, myjava.awt.datatransfer.MimeTypeProcessor.StringPosition r4) {
            java.lang.String r0 = retrieveToken(r2, r4)
            java.lang.String r0 = r0.toLowerCase()
            myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$1(r3, r0)
            int r0 = r4.i
            int r0 = getNextMeaningfulIndex(r2, r0)
            r4.i = r0
            int r1 = r2.length()
            if (r0 >= r1) goto L35
            int r0 = r4.i
            char r0 = r2.charAt(r0)
            r1 = 47
            if (r0 != r1) goto L35
            int r0 = r4.i
            int r0 = r0 + 1
            r4.i = r0
            java.lang.String r2 = retrieveToken(r2, r4)
            java.lang.String r2 = r2.toLowerCase()
            myjava.awt.datatransfer.MimeTypeProcessor.MimeType.access$2(r3, r2)
            return
        L35:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }
}
