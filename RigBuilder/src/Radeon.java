public class Radeon extends GPU{

    int ComputeUnits;
    int RayAccelerators;
    int StreamProcessors;
    int TextureUnits;
    int InfinityCache;
    int MemorySpeed;
    int MemoryBandwidth;

    void reset()
    {

        ComputeUnits = 0;
        RayAccelerators = 0;
        StreamProcessors = 0;
        TextureUnits = 0;
        InfinityCache = 0;
        MemorySpeed = 0;
        MemoryBandwidth = 0;
        return;

    }

    Radeon()
    {
        super.reset();
        reset();
        return;
    }


    public void setComputeUnits(int computeUnits) 
    {
        this.ComputeUnits = computeUnits;
        return;
    }

    public void setInfinityCache(int infinityCache) 
    {
        this.InfinityCache = infinityCache;
        return;
    }

    public void setRayAccelerators(int rayAccelerators) 
    {
        this.RayAccelerators = rayAccelerators;
        return;
    }

    public void setMemorySpeed(int memorySpeed) 
    {
        this.MemorySpeed = memorySpeed;
        return;
    }

    public void setMemoryBandwidth(int memoryBandwidth)
    {
        this.MemoryBandwidth = memoryBandwidth;
        return;
    }

    public void setStreamProcessors(int streamProcessors) 
    {
        this.StreamProcessors = streamProcessors;
        return;
    }

    public void setTextureUnits(int textureUnits) 
    {
        this.TextureUnits = textureUnits;
        return;
    }

    public int getStreamProcessors() 
    {
        return StreamProcessors;
    }

    public int getRayAccelerators() 
    {
        return RayAccelerators;
    }

    public int getMemoryBandwidth() 
    {
        return MemoryBandwidth;
    }

    public int getInfinityCache() 
    {
        return InfinityCache;
    }

    public int getMemorySpeed() 
    {
        return MemorySpeed;
    }

    public int getTextureUnits() 
    {
        return TextureUnits;
    }

    public int getComputeUnits()
    {
        return ComputeUnits;
    }


}
