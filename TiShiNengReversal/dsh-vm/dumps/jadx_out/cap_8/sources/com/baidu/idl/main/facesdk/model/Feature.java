package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Feature {
    private java.lang.String cropImageName;
    private long ctime;
    private java.lang.String faceToken;
    private byte[] feature;
    private java.lang.String groupId;
    private int id;
    private java.lang.String imageName;
    private boolean isChecked;
    private float score;
    private long updateTime;
    private java.lang.String userId;
    private java.lang.String userName;

    public Feature() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.faceToken = r0
            r1.userId = r0
            r1.groupId = r0
            r1.imageName = r0
            r1.userName = r0
            r1.cropImageName = r0
            return
    }

    public Feature(int r2, float r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.faceToken = r0
            r1.userId = r0
            r1.groupId = r0
            r1.imageName = r0
            r1.userName = r0
            r1.cropImageName = r0
            r1.id = r2
            r1.score = r3
            return
    }

    public java.lang.String getCropImageName() {
            r1 = this;
            java.lang.String r0 = r1.cropImageName
            return r0
    }

    public long getCtime() {
            r2 = this;
            long r0 = r2.ctime
            return r0
    }

    public java.lang.String getFaceToken() {
            r2 = this;
            byte[] r0 = r2.feature
            if (r0 == 0) goto L10
            r1 = 2
            byte[] r0 = android.util.Base64.encode(r0, r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r2.faceToken = r1
        L10:
            java.lang.String r0 = r2.faceToken
            return r0
    }

    public byte[] getFeature() {
            r1 = this;
            byte[] r0 = r1.feature
            return r0
    }

    public java.lang.String getGroupId() {
            r1 = this;
            java.lang.String r0 = r1.groupId
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.String getImageName() {
            r1 = this;
            java.lang.String r0 = r1.imageName
            return r0
    }

    public float getScore() {
            r1 = this;
            float r0 = r1.score
            return r0
    }

    public long getUpdateTime() {
            r2 = this;
            long r0 = r2.updateTime
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }

    public java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }

    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.isChecked
            return r0
    }

    public void setChecked(boolean r1) {
            r0 = this;
            r0.isChecked = r1
            return
    }

    public void setCropImageName(java.lang.String r1) {
            r0 = this;
            r0.cropImageName = r1
            return
    }

    public void setCtime(long r1) {
            r0 = this;
            r0.ctime = r1
            return
    }

    public void setFaceToken(java.lang.String r1) {
            r0 = this;
            r0.faceToken = r1
            return
    }

    public void setFeature(byte[] r1) {
            r0 = this;
            r0.feature = r1
            return
    }

    public void setGroupId(java.lang.String r1) {
            r0 = this;
            r0.groupId = r1
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setImageName(java.lang.String r1) {
            r0 = this;
            r0.imageName = r1
            return
    }

    public void setScore(float r1) {
            r0 = this;
            r0.score = r1
            return
    }

    public void setUpdateTime(long r1) {
            r0 = this;
            r0.updateTime = r1
            return
    }

    public void setUserId(java.lang.String r1) {
            r0 = this;
            r0.userId = r1
            return
    }

    public void setUserName(java.lang.String r1) {
            r0 = this;
            r0.userName = r1
            return
    }
}
