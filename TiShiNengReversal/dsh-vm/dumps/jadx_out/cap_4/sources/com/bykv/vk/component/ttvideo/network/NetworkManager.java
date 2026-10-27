package com.bykv.vk.component.ttvideo.network;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class NetworkManager {

    interface OnCompletionListener {
        void onCompletion(org.json.JSONObject r1);

        void onError(com.bykv.vk.component.ttvideo.log.LiveError r1);
    }

    private NetworkManager() {
            r0 = this;
            r0.<init>()
            return
    }

    static void doRequest(com.bykv.vk.component.ttvideo.INetworkClient r2, java.lang.String r3, java.lang.String r4, com.bykv.vk.component.ttvideo.network.NetworkManager.OnCompletionListener r5) {
            if (r4 != 0) goto L3
            return
        L3:
            com.bykv.vk.component.ttvideo.INetworkClient$Result r2 = r2.doRequest(r3, r4)
            if (r2 != 0) goto L18
            com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
            java.lang.String r3 = "result is null"
            r4 = 0
            r0 = -100011(0xfffffffffffe7955, float:NaN)
            r2.<init>(r0, r3, r4)
            r5.onError(r2)
            return
        L18:
            java.lang.Exception r3 = r2.e
            if (r3 != 0) goto L24
            org.json.JSONObject r4 = r2.response
            if (r4 == 0) goto L24
            r5.onCompletion(r4)
            return
        L24:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            org.json.JSONObject r0 = r2.response
            if (r0 == 0) goto L32
            java.lang.String r1 = "rawResp"
            r4.put(r1, r0)
        L32:
            boolean r0 = r3 instanceof java.io.IOException
            java.lang.String r1 = "description"
            if (r0 == 0) goto L4a
            java.lang.String r2 = "network IO exception"
            r4.put(r1, r2)
            com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
            r0 = -100008(0xfffffffffffe7958, float:NaN)
            java.lang.String r3 = r3.toString()
            r2.<init>(r0, r3, r4)
            goto L83
        L4a:
            boolean r0 = r3 instanceof org.json.JSONException
            if (r0 == 0) goto L72
            java.lang.String r0 = "parse JSON failure"
            r4.put(r1, r0)
            java.lang.String r0 = r2.body
            if (r0 == 0) goto L5c
            java.lang.String r1 = "rowBody"
            r4.put(r1, r0)
        L5c:
            java.lang.String r2 = r2.header
            if (r2 == 0) goto L65
            java.lang.String r0 = "responseHeader"
            r4.put(r0, r2)
        L65:
            com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
            r0 = -100000(0xfffffffffffe7960, float:NaN)
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r0, r3, r4)
            goto L83
        L72:
            java.lang.String r2 = "response not successful"
            r4.put(r1, r2)
            com.bykv.vk.component.ttvideo.log.LiveError r2 = new com.bykv.vk.component.ttvideo.log.LiveError
            r0 = -100004(0xfffffffffffe795c, float:NaN)
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r0, r3, r4)
        L83:
            r5.onError(r2)
            return
    }
}
