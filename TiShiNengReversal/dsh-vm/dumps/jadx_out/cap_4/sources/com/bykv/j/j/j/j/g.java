package com.bykv.j.j.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private boolean a;
    private int b;
    private java.lang.String c;
    private com.bykv.vk.openvk.api.proto.ValueSet d;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class b implements com.bykv.vk.openvk.api.proto.Result {
        private final boolean a;
        private final int b;
        private final java.lang.String c;
        private final com.bykv.vk.openvk.api.proto.ValueSet d;

        private b(boolean r1, int r2, java.lang.String r3, com.bykv.vk.openvk.api.proto.ValueSet r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        /* synthetic */ b(boolean r1, int r2, java.lang.String r3, com.bykv.vk.openvk.api.proto.ValueSet r4, com.bykv.j.j.j.j.g.a r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public java.lang.String message() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public com.bykv.vk.openvk.api.proto.ValueSet values() {
                r1 = this;
                com.bykv.vk.openvk.api.proto.ValueSet r0 = r1.d
                return r0
        }
    }

    private g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = -1
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.d = r0
            return
    }

    public static final com.bykv.j.j.j.j.g a() {
            com.bykv.j.j.j.j.g r0 = new com.bykv.j.j.j.j.g
            r0.<init>()
            return r0
    }

    public com.bykv.j.j.j.j.g b(int r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.bykv.j.j.j.j.g c(com.bykv.vk.openvk.api.proto.ValueSet r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public com.bykv.j.j.j.j.g d(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    public com.bykv.j.j.j.j.g e(boolean r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.bykv.vk.openvk.api.proto.Result f() {
            r6 = this;
            com.bykv.j.j.j.j.g$b r0 = new com.bykv.j.j.j.j.g$b
            boolean r1 = r6.a
            int r2 = r6.b
            java.lang.String r3 = r6.c
            com.bykv.vk.openvk.api.proto.ValueSet r4 = r6.d
            if (r4 != 0) goto L14
            com.bykv.j.j.j.j.a r4 = com.bykv.j.j.j.j.a.a()
            com.bykv.vk.openvk.api.proto.ValueSet r4 = r4.k()
        L14:
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
