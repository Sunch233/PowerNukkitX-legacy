package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.BlockColor;

import javax.annotation.Nullable;

@Since("1.4.0.0-PN")
@PowerNukkitOnly
public class BlockFungusCrimson extends BlockFungus {

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    public BlockFungusCrimson() {
        // Does nothing
    }

    @Override
    public int getId() {
        return CRIMSON_FUNGUS;
    }

    @Override
    public String getName() {
        return "Crimson Fungus";
    }

    @PowerNukkitOnly
    @Override
    protected boolean canGrowOn(Block support) {
        return support.getId() == CRIMSON_NYLIUM;
    }

    @PowerNukkitOnly
    @Override
    public boolean grow(@Nullable Player cause) {
        // TODO Make it grow
        return false;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.NETHERRACK_BLOCK_COLOR;
    }

    @Override
    public CompoundTag getPlantBlockTag() {
        var plantBlock = new CompoundTag("PlantBlock");
        plantBlock.putString("name", "minecraft:crimson_fungus");
        plantBlock.putCompound("states", new CompoundTag("states"));
        plantBlock.putInt("version", VERSION);
        var item = this.toItem();
        //only exist in PNX
        plantBlock.putInt("itemId", item.getId());
        plantBlock.putInt("itemMeta", item.getDamage());
        return plantBlock;
    }
}
