package androidx.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavDeepLink {
    private static final java.util.regex.Pattern SCHEME_PATTERN = null;
    private final java.lang.String mAction;
    private final java.util.ArrayList<java.lang.String> mArguments;
    private boolean mExactDeepLink;
    private boolean mIsParameterizedQuery;
    private final java.lang.String mMimeType;
    private java.util.regex.Pattern mMimeTypePattern;
    private final java.util.Map<java.lang.String, androidx.navigation.NavDeepLink.ParamQuery> mParamArgMap;
    private java.util.regex.Pattern mPattern;
    private final java.lang.String mUri;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private java.lang.String mAction;
        private java.lang.String mMimeType;
        private java.lang.String mUriPattern;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.navigation.NavDeepLink.Builder fromAction(@androidx.annotation.NonNull java.lang.String r1) {
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lf
                androidx.navigation.NavDeepLink$Builder r0 = new androidx.navigation.NavDeepLink$Builder
                r0.<init>()
                r0.setAction(r1)
                return r0
            Lf:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The NavDeepLink cannot have an empty action."
                r1.<init>(r0)
                throw r1
        }

        @androidx.annotation.NonNull
        public static androidx.navigation.NavDeepLink.Builder fromMimeType(@androidx.annotation.NonNull java.lang.String r1) {
                androidx.navigation.NavDeepLink$Builder r0 = new androidx.navigation.NavDeepLink$Builder
                r0.<init>()
                r0.setMimeType(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public static androidx.navigation.NavDeepLink.Builder fromUriPattern(@androidx.annotation.NonNull java.lang.String r1) {
                androidx.navigation.NavDeepLink$Builder r0 = new androidx.navigation.NavDeepLink$Builder
                r0.<init>()
                r0.setUriPattern(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLink build() {
                r4 = this;
                androidx.navigation.NavDeepLink r0 = new androidx.navigation.NavDeepLink
                java.lang.String r1 = r4.mUriPattern
                java.lang.String r2 = r4.mAction
                java.lang.String r3 = r4.mMimeType
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLink.Builder setAction(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L9
                r1.mAction = r2
                return r1
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The NavDeepLink cannot have an empty action."
                r2.<init>(r0)
                throw r2
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLink.Builder setMimeType(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.mMimeType = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.navigation.NavDeepLink.Builder setUriPattern(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.mUriPattern = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MimeType implements java.lang.Comparable<androidx.navigation.NavDeepLink.MimeType> {
        java.lang.String mSubType;
        java.lang.String mType;

        MimeType(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "/"
                r1 = -1
                java.lang.String[] r3 = r3.split(r0, r1)
                r0 = 0
                r0 = r3[r0]
                r2.mType = r0
                r0 = 1
                r3 = r3[r0]
                r2.mSubType = r3
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(@androidx.annotation.NonNull androidx.navigation.NavDeepLink.MimeType r3) {
                r2 = this;
                java.lang.String r0 = r2.mType
                java.lang.String r1 = r3.mType
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lc
                r0 = 2
                goto Ld
            Lc:
                r0 = 0
            Ld:
                java.lang.String r1 = r2.mSubType
                java.lang.String r3 = r3.mSubType
                boolean r3 = r1.equals(r3)
                if (r3 == 0) goto L19
                int r0 = r0 + 1
            L19:
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(@androidx.annotation.NonNull androidx.navigation.NavDeepLink.MimeType r1) {
                r0 = this;
                androidx.navigation.NavDeepLink$MimeType r1 = (androidx.navigation.NavDeepLink.MimeType) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ParamQuery {
        private java.util.ArrayList<java.lang.String> mArguments;
        private java.lang.String mParamRegex;

        ParamQuery() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mArguments = r0
                return
        }

        void addArgumentName(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mArguments
                r0.add(r2)
                return
        }

        java.lang.String getArgumentName(int r2) {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mArguments
                java.lang.Object r2 = r0.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                return r2
        }

        java.lang.String getParamRegex() {
                r1 = this;
                java.lang.String r0 = r1.mParamRegex
                return r0
        }

        void setParamRegex(java.lang.String r1) {
                r0 = this;
                r0.mParamRegex = r1
                return
        }

        public int size() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mArguments
                int r0 = r0.size()
                return r0
        }
    }

    static {
            java.lang.String r0 = "^[a-zA-Z]+[+\\w\\-.]*:"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.navigation.NavDeepLink.SCHEME_PATTERN = r0
            return
    }

    NavDeepLink(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    NavDeepLink(@androidx.annotation.Nullable java.lang.String r18, @androidx.annotation.Nullable java.lang.String r19, @androidx.annotation.Nullable java.lang.String r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mArguments = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.mParamArgMap = r3
            r3 = 0
            r0.mPattern = r3
            r4 = 0
            r0.mExactDeepLink = r4
            r0.mIsParameterizedQuery = r4
            r0.mMimeTypePattern = r3
            r0.mUri = r1
            r3 = r19
            r0.mAction = r3
            r0.mMimeType = r2
            if (r1 == 0) goto L104
            android.net.Uri r3 = android.net.Uri.parse(r1)
            java.lang.String r5 = r3.getQuery()
            r6 = 1
            if (r5 == 0) goto L38
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            r0.mIsParameterizedQuery = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "^"
            r5.<init>(r7)
            java.util.regex.Pattern r7 = androidx.navigation.NavDeepLink.SCHEME_PATTERN
            java.util.regex.Matcher r7 = r7.matcher(r1)
            boolean r7 = r7.find()
            if (r7 != 0) goto L53
            java.lang.String r7 = "http[s]?://"
            r5.append(r7)
        L53:
            java.lang.String r7 = "\\{(.+?)\\}"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            boolean r8 = r0.mIsParameterizedQuery
            java.lang.String r9 = "\\E.*\\Q"
            java.lang.String r10 = ".*"
            if (r8 == 0) goto Lef
            java.lang.String r8 = "(\\?)"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            java.util.regex.Matcher r8 = r8.matcher(r1)
            boolean r11 = r8.find()
            if (r11 == 0) goto L7c
            int r8 = r8.start()
            java.lang.String r1 = r1.substring(r4, r8)
            r0.buildPathRegex(r1, r5, r7)
        L7c:
            r0.mExactDeepLink = r4
            java.util.Set r1 = r3.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L86:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Lf5
            java.lang.Object r8 = r1.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r3.getQueryParameter(r8)
            java.util.regex.Matcher r13 = r7.matcher(r12)
            androidx.navigation.NavDeepLink$ParamQuery r14 = new androidx.navigation.NavDeepLink$ParamQuery
            r14.<init>()
            r15 = 0
        La5:
            boolean r16 = r13.find()
            if (r16 == 0) goto Lcc
            java.lang.String r4 = r13.group(r6)
            r14.addArgumentName(r4)
            int r4 = r13.start()
            java.lang.String r4 = r12.substring(r15, r4)
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            r11.append(r4)
            java.lang.String r4 = "(.+?)?"
            r11.append(r4)
            int r15 = r13.end()
            r4 = 0
            goto La5
        Lcc:
            int r4 = r12.length()
            if (r15 >= r4) goto Ldd
            java.lang.String r4 = r12.substring(r15)
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            r11.append(r4)
        Ldd:
            java.lang.String r4 = r11.toString()
            java.lang.String r4 = r4.replace(r10, r9)
            r14.setParamRegex(r4)
            java.util.Map<java.lang.String, androidx.navigation.NavDeepLink$ParamQuery> r4 = r0.mParamArgMap
            r4.put(r8, r14)
            r4 = 0
            goto L86
        Lef:
            boolean r1 = r0.buildPathRegex(r1, r5, r7)
            r0.mExactDeepLink = r1
        Lf5:
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = r1.replace(r10, r9)
            r3 = 2
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r3)
            r0.mPattern = r1
        L104:
            if (r2 == 0) goto L16a
            java.lang.String r1 = "^[\\s\\S]+/[\\s\\S]+$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L14e
            androidx.navigation.NavDeepLink$MimeType r1 = new androidx.navigation.NavDeepLink$MimeType
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "^("
            r2.append(r3)
            java.lang.String r3 = r1.mType
            r2.append(r3)
            java.lang.String r3 = "|[*]+)/("
            r2.append(r3)
            java.lang.String r1 = r1.mSubType
            r2.append(r1)
            java.lang.String r1 = "|[*]+)$"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "*|[*]"
            java.lang.String r3 = "[\\s\\S]"
            java.lang.String r1 = r1.replace(r2, r3)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r0.mMimeTypePattern = r1
            return
        L14e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The given mimeType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " does not match to required \"type/subtype\" format"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L16a:
            return
    }

    private boolean buildPathRegex(@androidx.annotation.NonNull java.lang.String r6, java.lang.StringBuilder r7, java.util.regex.Pattern r8) {
            r5 = this;
            java.util.regex.Matcher r8 = r8.matcher(r6)
            java.lang.String r0 = ".*"
            boolean r0 = r6.contains(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            r3 = 0
        Le:
            boolean r4 = r8.find()
            if (r4 == 0) goto L37
            java.lang.String r0 = r8.group(r1)
            java.util.ArrayList<java.lang.String> r4 = r5.mArguments
            r4.add(r0)
            int r0 = r8.start()
            java.lang.String r0 = r6.substring(r3, r0)
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            r7.append(r0)
            java.lang.String r0 = "(.+?)"
            r7.append(r0)
            int r3 = r8.end()
            r0 = 0
            goto Le
        L37:
            int r8 = r6.length()
            if (r3 >= r8) goto L48
            java.lang.String r6 = r6.substring(r3)
            java.lang.String r6 = java.util.regex.Pattern.quote(r6)
            r7.append(r6)
        L48:
            java.lang.String r6 = "($|(\\?(.)*))"
            r7.append(r6)
            return r0
    }

    private boolean matchAction(java.lang.String r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = r5.mAction
            if (r3 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r2 != r4) goto L11
            return r1
        L11:
            if (r6 == 0) goto L1b
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L1a
            goto L1b
        L1a:
            return r1
        L1b:
            return r0
    }

    private boolean matchMimeType(java.lang.String r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = r4.mMimeType
            if (r3 == 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r2 != r3) goto L11
            return r1
        L11:
            if (r5 == 0) goto L21
            java.util.regex.Pattern r2 = r4.mMimeTypePattern
            java.util.regex.Matcher r5 = r2.matcher(r5)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L20
            goto L21
        L20:
            return r1
        L21:
            return r0
    }

    private boolean matchUri(android.net.Uri r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.util.regex.Pattern r3 = r5.mPattern
            if (r3 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r2 != r4) goto L11
            return r1
        L11:
            if (r6 == 0) goto L23
            java.lang.String r6 = r6.toString()
            java.util.regex.Matcher r6 = r3.matcher(r6)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L22
            goto L23
        L22:
            return r1
        L23:
            return r0
    }

    private boolean parseArgument(android.os.Bundle r1, java.lang.String r2, java.lang.String r3, androidx.navigation.NavArgument r4) {
            r0 = this;
            if (r4 == 0) goto Lc
            androidx.navigation.NavType r4 = r4.getType()
            r4.parseAndPut(r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> La
            goto Lf
        La:
            r1 = 1
            return r1
        Lc:
            r1.putString(r2, r3)
        Lf:
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    public java.lang.String getAction() {
            r1 = this;
            java.lang.String r0 = r1.mAction
            return r0
    }

    @androidx.annotation.Nullable
    android.os.Bundle getMatchingArguments(@androidx.annotation.NonNull android.net.Uri r13, @androidx.annotation.NonNull java.util.Map<java.lang.String, androidx.navigation.NavArgument> r14) {
            r12 = this;
            java.util.regex.Pattern r0 = r12.mPattern
            java.lang.String r1 = r13.toString()
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r1 = r0.matches()
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.ArrayList<java.lang.String> r3 = r12.mArguments
            int r3 = r3.size()
            r4 = 0
            r5 = 0
        L1f:
            if (r5 >= r3) goto L40
            java.util.ArrayList<java.lang.String> r6 = r12.mArguments
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r5 + 1
            java.lang.String r7 = r0.group(r5)
            java.lang.String r7 = android.net.Uri.decode(r7)
            java.lang.Object r8 = r14.get(r6)
            androidx.navigation.NavArgument r8 = (androidx.navigation.NavArgument) r8
            boolean r6 = r12.parseArgument(r1, r6, r7, r8)
            if (r6 == 0) goto L1f
            return r2
        L40:
            boolean r0 = r12.mIsParameterizedQuery
            if (r0 == 0) goto Lb5
            java.util.Map<java.lang.String, androidx.navigation.NavDeepLink$ParamQuery> r0 = r12.mParamArgMap
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, androidx.navigation.NavDeepLink$ParamQuery> r5 = r12.mParamArgMap
            java.lang.Object r5 = r5.get(r3)
            androidx.navigation.NavDeepLink$ParamQuery r5 = (androidx.navigation.NavDeepLink.ParamQuery) r5
            java.lang.String r3 = r13.getQueryParameter(r3)
            if (r3 == 0) goto L7b
            java.lang.String r6 = r5.getParamRegex()
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Matcher r3 = r6.matcher(r3)
            boolean r6 = r3.matches()
            if (r6 != 0) goto L7c
            return r2
        L7b:
            r3 = r2
        L7c:
            r6 = 0
        L7d:
            int r7 = r5.size()
            if (r6 >= r7) goto L4e
            if (r3 == 0) goto L90
            int r7 = r6 + 1
            java.lang.String r7 = r3.group(r7)
            java.lang.String r7 = android.net.Uri.decode(r7)
            goto L91
        L90:
            r7 = r2
        L91:
            java.lang.String r8 = r5.getArgumentName(r6)
            java.lang.Object r9 = r14.get(r8)
            androidx.navigation.NavArgument r9 = (androidx.navigation.NavArgument) r9
            if (r7 == 0) goto Lb2
            java.lang.String r10 = "[{}]"
            java.lang.String r11 = ""
            java.lang.String r10 = r7.replaceAll(r10, r11)
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto Lb2
            boolean r7 = r12.parseArgument(r1, r8, r7, r9)
            if (r7 == 0) goto Lb2
            return r2
        Lb2:
            int r6 = r6 + 1
            goto L7d
        Lb5:
            return r1
    }

    @androidx.annotation.Nullable
    public java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mMimeType
            return r0
    }

    int getMimeTypeMatchRating(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.mMimeType
            if (r0 == 0) goto L22
            java.util.regex.Pattern r0 = r2.mMimeTypePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L11
            goto L22
        L11:
            androidx.navigation.NavDeepLink$MimeType r0 = new androidx.navigation.NavDeepLink$MimeType
            java.lang.String r1 = r2.mMimeType
            r0.<init>(r1)
            androidx.navigation.NavDeepLink$MimeType r1 = new androidx.navigation.NavDeepLink$MimeType
            r1.<init>(r3)
            int r3 = r0.compareTo2(r1)
            return r3
        L22:
            r3 = -1
            return r3
    }

    @androidx.annotation.Nullable
    public java.lang.String getUriPattern() {
            r1 = this;
            java.lang.String r0 = r1.mUri
            return r0
    }

    boolean isExactDeepLink() {
            r1 = this;
            boolean r0 = r1.mExactDeepLink
            return r0
    }

    boolean matches(@androidx.annotation.NonNull android.net.Uri r3) {
            r2 = this;
            androidx.navigation.NavDeepLinkRequest r0 = new androidx.navigation.NavDeepLinkRequest
            r1 = 0
            r0.<init>(r3, r1, r1)
            boolean r3 = r2.matches(r0)
            return r3
    }

    boolean matches(@androidx.annotation.NonNull androidx.navigation.NavDeepLinkRequest r3) {
            r2 = this;
            android.net.Uri r0 = r3.getUri()
            boolean r0 = r2.matchUri(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = r3.getAction()
            boolean r0 = r2.matchAction(r0)
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.String r3 = r3.getMimeType()
            boolean r3 = r2.matchMimeType(r3)
            return r3
    }
}
