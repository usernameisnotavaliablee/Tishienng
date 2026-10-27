package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Labels {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DefaultLabelFilter implements com.alibaba.fastjson.serializer.LabelFilter {
        private java.lang.String[] excludes;
        private java.lang.String[] includes;

        public DefaultLabelFilter(java.lang.String[] r4, java.lang.String[] r5) {
                r3 = this;
                r3.<init>()
                r0 = 0
                if (r4 == 0) goto L14
                int r1 = r4.length
                java.lang.String[] r1 = new java.lang.String[r1]
                r3.includes = r1
                int r2 = r4.length
                java.lang.System.arraycopy(r4, r0, r1, r0, r2)
                java.lang.String[] r4 = r3.includes
                java.util.Arrays.sort(r4)
            L14:
                if (r5 == 0) goto L24
                int r4 = r5.length
                java.lang.String[] r4 = new java.lang.String[r4]
                r3.excludes = r4
                int r1 = r5.length
                java.lang.System.arraycopy(r5, r0, r4, r0, r1)
                java.lang.String[] r4 = r3.excludes
                java.util.Arrays.sort(r4)
            L24:
                return
        }

        @Override // com.alibaba.fastjson.serializer.LabelFilter
        public boolean apply(java.lang.String r4) {
                r3 = this;
                java.lang.String[] r0 = r3.excludes
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Lf
                int r4 = java.util.Arrays.binarySearch(r0, r4)
                r0 = -1
                if (r4 != r0) goto Le
                return r2
            Le:
                return r1
            Lf:
                java.lang.String[] r0 = r3.includes
                if (r0 == 0) goto L1a
                int r4 = java.util.Arrays.binarySearch(r0, r4)
                if (r4 < 0) goto L1a
                return r2
            L1a:
                return r1
        }
    }

    public Labels() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.alibaba.fastjson.serializer.LabelFilter excludes(java.lang.String... r2) {
            com.alibaba.fastjson.serializer.Labels$DefaultLabelFilter r0 = new com.alibaba.fastjson.serializer.Labels$DefaultLabelFilter
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson.serializer.LabelFilter includes(java.lang.String... r2) {
            com.alibaba.fastjson.serializer.Labels$DefaultLabelFilter r0 = new com.alibaba.fastjson.serializer.Labels$DefaultLabelFilter
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
