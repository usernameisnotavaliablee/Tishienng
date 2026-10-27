package com.bykv.vk.component.ttvideo;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface INetworkClient {

    /* renamed from: com.bykv.vk.component.ttvideo.INetworkClient$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    @com.bykv.vk.component.ttvideo.player.Keep
    public static class Result {
        public final java.lang.String body;
        public final int code;
        public final java.lang.Exception e;
        public final java.lang.String header;
        public final org.json.JSONObject response;

        @com.bykv.vk.component.ttvideo.player.Keep
        public static class Builder {
            java.lang.String body;
            int code;
            java.lang.Exception e;
            java.lang.String header;
            org.json.JSONObject response;

            private Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ Builder(com.bykv.vk.component.ttvideo.INetworkClient.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.bykv.vk.component.ttvideo.INetworkClient.Result build() {
                    r2 = this;
                    com.bykv.vk.component.ttvideo.INetworkClient$Result r0 = new com.bykv.vk.component.ttvideo.INetworkClient$Result
                    r1 = 0
                    r0.<init>(r2, r1)
                    return r0
            }

            public com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder setBody(java.lang.String r1) {
                    r0 = this;
                    r0.body = r1
                    return r0
            }

            public com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder setCode(int r1) {
                    r0 = this;
                    r0.code = r1
                    return r0
            }

            public com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder setException(java.lang.Exception r1) {
                    r0 = this;
                    r0.e = r1
                    return r0
            }

            public com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder setHeader(java.lang.String r1) {
                    r0 = this;
                    r0.header = r1
                    return r0
            }

            public com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder setResponse(org.json.JSONObject r1) {
                    r0 = this;
                    r0.response = r1
                    return r0
            }
        }

        private Result(com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder r2) {
                r1 = this;
                r1.<init>()
                org.json.JSONObject r0 = r2.response
                r1.response = r0
                java.lang.String r0 = r2.body
                r1.body = r0
                java.lang.String r0 = r2.header
                r1.header = r0
                java.lang.Exception r0 = r2.e
                r1.e = r0
                int r2 = r2.code
                r1.code = r2
                return
        }

        /* synthetic */ Result(com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder r1, com.bykv.vk.component.ttvideo.INetworkClient.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static com.bykv.vk.component.ttvideo.INetworkClient.Result.Builder newBuilder() {
                com.bykv.vk.component.ttvideo.INetworkClient$Result$Builder r0 = new com.bykv.vk.component.ttvideo.INetworkClient$Result$Builder
                r1 = 0
                r0.<init>(r1)
                return r0
        }
    }

    com.bykv.vk.component.ttvideo.INetworkClient.Result doPost(java.lang.String r1, java.lang.String r2);

    com.bykv.vk.component.ttvideo.INetworkClient.Result doRequest(java.lang.String r1, java.lang.String r2);
}
