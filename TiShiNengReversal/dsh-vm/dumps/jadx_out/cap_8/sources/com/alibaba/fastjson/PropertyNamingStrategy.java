package com.alibaba.fastjson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum PropertyNamingStrategy extends java.lang.Enum<com.alibaba.fastjson.PropertyNamingStrategy> {
    private static final /* synthetic */ com.alibaba.fastjson.PropertyNamingStrategy[] $VALUES = null;
    public static final com.alibaba.fastjson.PropertyNamingStrategy CamelCase = null;
    public static final com.alibaba.fastjson.PropertyNamingStrategy KebabCase = null;
    public static final com.alibaba.fastjson.PropertyNamingStrategy PascalCase = null;
    public static final com.alibaba.fastjson.PropertyNamingStrategy SnakeCase = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.alibaba.fastjson.PropertyNamingStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy = null;

        static {
                com.alibaba.fastjson.PropertyNamingStrategy[] r0 = com.alibaba.fastjson.PropertyNamingStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.alibaba.fastjson.PropertyNamingStrategy.AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy = r0
                com.alibaba.fastjson.PropertyNamingStrategy r1 = com.alibaba.fastjson.PropertyNamingStrategy.SnakeCase     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.alibaba.fastjson.PropertyNamingStrategy.AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                com.alibaba.fastjson.PropertyNamingStrategy r1 = com.alibaba.fastjson.PropertyNamingStrategy.KebabCase     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.alibaba.fastjson.PropertyNamingStrategy.AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy     // Catch: java.lang.NoSuchFieldError -> L28
                com.alibaba.fastjson.PropertyNamingStrategy r1 = com.alibaba.fastjson.PropertyNamingStrategy.PascalCase     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.alibaba.fastjson.PropertyNamingStrategy.AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy     // Catch: java.lang.NoSuchFieldError -> L33
                com.alibaba.fastjson.PropertyNamingStrategy r1 = com.alibaba.fastjson.PropertyNamingStrategy.CamelCase     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.alibaba.fastjson.PropertyNamingStrategy r0 = new com.alibaba.fastjson.PropertyNamingStrategy
            java.lang.String r1 = "CamelCase"
            r2 = 0
            r0.<init>(r1, r2)
            com.alibaba.fastjson.PropertyNamingStrategy.CamelCase = r0
            com.alibaba.fastjson.PropertyNamingStrategy r1 = new com.alibaba.fastjson.PropertyNamingStrategy
            java.lang.String r3 = "PascalCase"
            r4 = 1
            r1.<init>(r3, r4)
            com.alibaba.fastjson.PropertyNamingStrategy.PascalCase = r1
            com.alibaba.fastjson.PropertyNamingStrategy r3 = new com.alibaba.fastjson.PropertyNamingStrategy
            java.lang.String r5 = "SnakeCase"
            r6 = 2
            r3.<init>(r5, r6)
            com.alibaba.fastjson.PropertyNamingStrategy.SnakeCase = r3
            com.alibaba.fastjson.PropertyNamingStrategy r5 = new com.alibaba.fastjson.PropertyNamingStrategy
            java.lang.String r7 = "KebabCase"
            r8 = 3
            r5.<init>(r7, r8)
            com.alibaba.fastjson.PropertyNamingStrategy.KebabCase = r5
            r7 = 4
            com.alibaba.fastjson.PropertyNamingStrategy[] r7 = new com.alibaba.fastjson.PropertyNamingStrategy[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.alibaba.fastjson.PropertyNamingStrategy.$VALUES = r7
            return
    }

    PropertyNamingStrategy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.alibaba.fastjson.PropertyNamingStrategy valueOf(java.lang.String r1) {
            java.lang.Class<com.alibaba.fastjson.PropertyNamingStrategy> r0 = com.alibaba.fastjson.PropertyNamingStrategy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.alibaba.fastjson.PropertyNamingStrategy r1 = (com.alibaba.fastjson.PropertyNamingStrategy) r1
            return r1
    }

    public static com.alibaba.fastjson.PropertyNamingStrategy[] values() {
            com.alibaba.fastjson.PropertyNamingStrategy[] r0 = com.alibaba.fastjson.PropertyNamingStrategy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.alibaba.fastjson.PropertyNamingStrategy[] r0 = (com.alibaba.fastjson.PropertyNamingStrategy[]) r0
            return r0
    }

    public java.lang.String translate(java.lang.String r7) {
            r6 = this;
            int[] r0 = com.alibaba.fastjson.PropertyNamingStrategy.AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 90
            r3 = 65
            r4 = 0
            if (r0 == r1) goto L7e
            r1 = 2
            if (r0 == r1) goto L52
            r1 = 3
            if (r0 == r1) goto L34
            r1 = 4
            if (r0 == r1) goto L1a
            return r7
        L1a:
            char r0 = r7.charAt(r4)
            if (r0 < r3) goto L33
            if (r0 > r2) goto L33
            char[] r7 = r7.toCharArray()
            char r0 = r7[r4]
            int r0 = r0 + 32
            char r0 = (char) r0
            r7[r4] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            return r0
        L33:
            return r7
        L34:
            char r0 = r7.charAt(r4)
            r1 = 97
            if (r0 < r1) goto L51
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L51
            char[] r7 = r7.toCharArray()
            char r0 = r7[r4]
            int r0 = r0 + (-32)
            char r0 = (char) r0
            r7[r4] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            return r0
        L51:
            return r7
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L57:
            int r1 = r7.length()
            if (r4 >= r1) goto L79
            char r1 = r7.charAt(r4)
            if (r1 < r3) goto L73
            if (r1 > r2) goto L73
            int r1 = r1 + 32
            char r1 = (char) r1
            if (r4 <= 0) goto L6f
            r5 = 45
            r0.append(r5)
        L6f:
            r0.append(r1)
            goto L76
        L73:
            r0.append(r1)
        L76:
            int r4 = r4 + 1
            goto L57
        L79:
            java.lang.String r7 = r0.toString()
            return r7
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L83:
            int r1 = r7.length()
            if (r4 >= r1) goto La5
            char r1 = r7.charAt(r4)
            if (r1 < r3) goto L9f
            if (r1 > r2) goto L9f
            int r1 = r1 + 32
            char r1 = (char) r1
            if (r4 <= 0) goto L9b
            r5 = 95
            r0.append(r5)
        L9b:
            r0.append(r1)
            goto La2
        L9f:
            r0.append(r1)
        La2:
            int r4 = r4 + 1
            goto L83
        La5:
            java.lang.String r7 = r0.toString()
            return r7
    }
}
