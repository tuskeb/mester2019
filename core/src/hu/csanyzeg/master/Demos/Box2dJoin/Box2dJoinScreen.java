package hu.csanyzeg.master.Demos.Box2dJoin;

import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;

import javax.swing.Box;

import hu.csanyzeg.master.Demos.Box2dHelper.BoxActor;
import hu.csanyzeg.master.Demos.Box2dHelper.WallActor;
import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class Box2dJoinScreen extends MyScreen {
    public Box2dJoinScreen(MyGame game) {
        super(game);
        //game.debug = true;
    }

    @Override
    protected void afterAssetsLoaded() {
        Box2dJoinStage box2dJoinStage;
        addStage(box2dJoinStage = new Box2dJoinStage(game),1,true);
        addStage(new ControlStage(game, box2dJoinStage), 2 , true);

    }

    @Override
    public AssetList getAssetList() {
        AssetList assetList = new AssetList();
        AssetList.collectAssetDescriptor(Box2dJoinStage.class, assetList);
        AssetList.collectAssetDescriptor(ControlStage.class, assetList);
        return assetList;
    }

    @Override
    public void init() {

    }
}