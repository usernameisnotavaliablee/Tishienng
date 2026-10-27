package com.google.gson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum FieldNamingPolicy extends java.lang.Enum<com.google.gson.FieldNamingPolicy> implements com.google.gson.FieldNamingStrategy {
    private static final /* synthetic */ com.google.gson.FieldNamingPolicy[] $VALUES = null;
    public static final com.google.gson.FieldNamingPolicy IDENTITY = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DOTS = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;







    static {
            com.google.gson.FieldNamingPolicy$1 r0 = new com.google.gson.FieldNamingPolicy$1
            java.lang.String r1 = "IDENTITY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.IDENTITY = r0
            com.google.gson.FieldNamingPolicy$2 r1 = new com.google.gson.FieldNamingPolicy$2
            java.lang.String r3 = "UPPER_CAMEL_CASE"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE = r1
            com.google.gson.FieldNamingPolicy$3 r3 = new com.google.gson.FieldNamingPolicy$3
            java.lang.String r5 = "UPPER_CAMEL_CASE_WITH_SPACES"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES = r3
            com.google.gson.FieldNamingPolicy$4 r5 = new com.google.gson.FieldNamingPolicy$4
            java.lang.String r7 = "LOWER_CASE_WITH_UNDERSCORES"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = r5
            com.google.gson.FieldNamingPolicy$5 r7 = new com.google.gson.FieldNamingPolicy$5
            java.lang.String r9 = "LOWER_CASE_WITH_DASHES"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES = r7
            com.google.gson.FieldNamingPolicy$6 r9 = new com.google.gson.FieldNamingPolicy$6
            java.lang.String r11 = "LOWER_CASE_WITH_DOTS"
            r12 = 5
            r9.<init>(r11, r12)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DOTS = r9
            r11 = 6
            com.google.gson.FieldNamingPolicy[] r11 = new com.google.gson.FieldNamingPolicy[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.gson.FieldNamingPolicy.$VALUES = r11
            return
    }

    FieldNamingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ FieldNamingPolicy(java.lang.String r1, int r2, com.google.gson.FieldNamingPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static java.lang.String modifyString(char r1, java.lang.String r2, int r3) {
            int r0 = r2.length()
            if (r3 >= r0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = r2.substring(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        L1a:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    static java.lang.String separateCamelCase(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    static java.lang.String upperCaseFirstLetter(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r2 = r5.charAt(r1)
            int r3 = r5.length()
        Le:
            int r4 = r3 + (-1)
            if (r1 >= r4) goto L23
            boolean r4 = java.lang.Character.isLetter(r2)
            if (r4 == 0) goto L19
            goto L23
        L19:
            r0.append(r2)
            int r1 = r1 + 1
            char r2 = r5.charAt(r1)
            goto Le
        L23:
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 != 0) goto L3a
            char r2 = java.lang.Character.toUpperCase(r2)
            int r1 = r1 + 1
            java.lang.String r5 = modifyString(r2, r5, r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L3a:
            return r5
    }

    public static com.google.gson.FieldNamingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.FieldNamingPolicy> r0 = com.google.gson.FieldNamingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.FieldNamingPolicy r1 = (com.google.gson.FieldNamingPolicy) r1
            return r1
    }

    public static com.google.gson.FieldNamingPolicy[] values() {
            com.google.gson.FieldNamingPolicy[] r0 = com.google.gson.FieldNamingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.FieldNamingPolicy[] r0 = (com.google.gson.FieldNamingPolicy[]) r0
            return r0
    }
}
