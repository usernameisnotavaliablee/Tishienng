package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapCameraInfo {
    private float aspectRatio;
    private float fov;
    private float positionX;
    private float positionY;
    private float positionZ;
    private float rotate;

    public AMapCameraInfo(float r1, float r2, float r3, float r4, float r5, float r6) {
            r0 = this;
            r0.<init>()
            r0.fov = r1
            r0.aspectRatio = r2
            r0.rotate = r3
            r0.positionX = r4
            r0.positionY = r5
            r0.positionZ = r6
            return
    }

    public float getAspectRatio() {
            r1 = this;
            float r0 = r1.aspectRatio
            return r0
    }

    public float getFov() {
            r1 = this;
            float r0 = r1.fov
            return r0
    }

    public float getRotate() {
            r1 = this;
            float r0 = r1.rotate
            return r0
    }

    public float getX() {
            r1 = this;
            float r0 = r1.positionX
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.positionY
            return r0
    }

    public float getZ() {
            r1 = this;
            float r0 = r1.positionZ
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[fov:"
            r0.append(r1)
            float r1 = r3.fov
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = "aspectRatio:"
            r0.append(r2)
            float r2 = r3.aspectRatio
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "rotate:"
            r0.append(r2)
            float r2 = r3.rotate
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "pos_x:"
            r0.append(r2)
            float r2 = r3.positionX
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "pos_y:"
            r0.append(r2)
            float r2 = r3.positionY
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "pos_z:"
            r0.append(r1)
            float r1 = r3.positionZ
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
