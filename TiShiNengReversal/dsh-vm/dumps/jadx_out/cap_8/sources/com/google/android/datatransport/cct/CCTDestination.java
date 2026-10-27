package com.google.android.datatransport.cct;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CCTDestination implements com.google.android.datatransport.runtime.EncodedDestination {
    private static final java.lang.String DEFAULT_API_KEY = null;
    static final java.lang.String DEFAULT_END_POINT = null;
    static final java.lang.String DESTINATION_NAME = "cct";
    private static final java.lang.String EXTRAS_DELIMITER = "\\";
    private static final java.lang.String EXTRAS_VERSION_MARKER = "1$";
    public static final com.google.android.datatransport.cct.CCTDestination INSTANCE = null;
    static final java.lang.String LEGACY_END_POINT = null;
    public static final com.google.android.datatransport.cct.CCTDestination LEGACY_INSTANCE = null;
    private static final java.util.Set<com.google.android.datatransport.Encoding> SUPPORTED_ENCODINGS = null;

    @androidx.annotation.Nullable
    private final java.lang.String apiKey;

    @androidx.annotation.NonNull
    private final java.lang.String endPoint;

    static {
            java.lang.String r0 = "hts/frbslgiggolai.o/0clgbthfra=snpoo"
            java.lang.String r1 = "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3"
            java.lang.String r0 = com.google.android.datatransport.cct.StringMerger.mergeStrings(r0, r1)
            com.google.android.datatransport.cct.CCTDestination.DEFAULT_END_POINT = r0
            java.lang.String r1 = "hts/frbslgigp.ogepscmv/ieo/eaybtho"
            java.lang.String r2 = "tp:/ieaeogn-agolai.o/1frlglgc/aclg"
            java.lang.String r1 = com.google.android.datatransport.cct.StringMerger.mergeStrings(r1, r2)
            com.google.android.datatransport.cct.CCTDestination.LEGACY_END_POINT = r1
            java.lang.String r2 = "AzSCki82AwsLzKd5O8zo"
            java.lang.String r3 = "IayckHiZRO1EFl1aGoK"
            java.lang.String r2 = com.google.android.datatransport.cct.StringMerger.mergeStrings(r2, r3)
            com.google.android.datatransport.cct.CCTDestination.DEFAULT_API_KEY = r2
            java.util.HashSet r3 = new java.util.HashSet
            java.lang.String r4 = "proto"
            com.google.android.datatransport.Encoding r4 = com.google.android.datatransport.Encoding.of(r4)
            java.lang.String r5 = "json"
            com.google.android.datatransport.Encoding r5 = com.google.android.datatransport.Encoding.of(r5)
            r6 = 2
            com.google.android.datatransport.Encoding[] r6 = new com.google.android.datatransport.Encoding[r6]
            r7 = 0
            r6[r7] = r4
            r4 = 1
            r6[r4] = r5
            java.util.List r4 = java.util.Arrays.asList(r6)
            r3.<init>(r4)
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            com.google.android.datatransport.cct.CCTDestination.SUPPORTED_ENCODINGS = r3
            com.google.android.datatransport.cct.CCTDestination r3 = new com.google.android.datatransport.cct.CCTDestination
            r4 = 0
            r3.<init>(r0, r4)
            com.google.android.datatransport.cct.CCTDestination.INSTANCE = r3
            com.google.android.datatransport.cct.CCTDestination r0 = new com.google.android.datatransport.cct.CCTDestination
            r0.<init>(r1, r2)
            com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE = r0
            return
    }

    public CCTDestination(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.endPoint = r1
            r0.apiKey = r2
            return
    }

    @androidx.annotation.NonNull
    static java.lang.String decodeExtras(@androidx.annotation.NonNull byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    static byte[] encodeString(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.CCTDestination fromByteArray(@androidx.annotation.NonNull byte[] r3) {
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r3, r1)
            java.lang.String r3 = "1$"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L4e
            r3 = 2
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r1 = "\\"
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            java.lang.String[] r0 = r0.split(r1, r3)
            int r1 = r0.length
            if (r1 != r3) goto L46
            r3 = 0
            r3 = r0[r3]
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3e
            r1 = 1
            r0 = r0[r1]
            com.google.android.datatransport.cct.CCTDestination r1 = new com.google.android.datatransport.cct.CCTDestination
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L3a
            r0 = 0
        L3a:
            r1.<init>(r3, r0)
            return r1
        L3e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing endpoint in CCTDestination extras"
            r3.<init>(r0)
            throw r3
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Extra is not a valid encoded LegacyFlgDestination"
            r3.<init>(r0)
            throw r3
        L4e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Version marker missing from extras"
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.Nullable
    public byte[] asByteArray() {
            r5 = this;
            java.lang.String r0 = r5.apiKey
            if (r0 != 0) goto La
            java.lang.String r1 = r5.endPoint
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r1 = r5.endPoint
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "1$"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "\\"
            r3 = 2
            r2[r3] = r1
            r1 = 3
            r2[r1] = r0
            java.lang.String r0 = "%s%s%s%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getAPIKey() {
            r1 = this;
            java.lang.String r0 = r1.apiKey
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getEndPoint() {
            r1 = this;
            java.lang.String r0 = r1.endPoint
            return r0
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @androidx.annotation.Nullable
    public byte[] getExtras() {
            r1 = this;
            byte[] r0 = r1.asByteArray()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @androidx.annotation.NonNull
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "cct"
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public java.util.Set<com.google.android.datatransport.Encoding> getSupportedEncodings() {
            r1 = this;
            java.util.Set<com.google.android.datatransport.Encoding> r0 = com.google.android.datatransport.cct.CCTDestination.SUPPORTED_ENCODINGS
            return r0
    }
}
