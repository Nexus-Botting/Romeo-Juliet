package Romeo;

import org.powerbot.script.*;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.*;
import org.powerbot.script.rt4.ClientContext;

import java.util.concurrent.Callable;

@Script.Manifest(name="Romeo & Juliet", description="trying")


public class Romeo extends PollingScript<ClientContext> {

    public int completion = 1;
    public static final int ROMEO = 5037;
    public static final int JULIET = 5035;
    public static final int NOTE = 755;
    public static final int FATHER = 5038;
    public static final int BUSH = 23625;
    public static final int BERRY = 753;
    public static final int POT = 756;
    public static final int APOTHECARY = 5036;

    public static final String[] CHAT_OPTIONS = {"Yes, ok, I'll let her know.","Ok, thanks.","Perhaps"};

    public static final Tile[] romeoToJuliet = {
            new Tile(3216, 3429, 0),
            new Tile(3213, 3429, 0),
            new Tile(3210, 3429, 0),
            new Tile(3207, 3429, 0),
            new Tile(3204, 3429, 0),
            new Tile(3201, 3429, 0),
            new Tile(3198, 3429, 0),
            new Tile(3195, 3429, 0),
            new Tile(3192, 3429, 0),
            new Tile(3189, 3429, 0),
            new Tile(3186, 3429, 0),
            new Tile(3183, 3429, 0),
            new Tile(3180, 3429, 0),
            new Tile(3177, 3429, 0),
            new Tile(3174, 3429, 0),
            new Tile(3171, 3431, 0),
            new Tile(3168, 3432, 0),
            new Tile(3165, 3433, 0),
            new Tile(3163, 3433, 0),
            new Tile(3160, 3435, 0),
            new Tile(3155, 3435, 1),
            new Tile(3157, 3432, 1),
            new Tile(3157, 3429, 1),
            new Tile(3158, 3426, 1),
            new Tile(3161, 3426, 1)};

    public static final Tile[] romeoToFather = {
            new Tile(3215, 3429, 0),
            new Tile(3218, 3429, 0),
            new Tile(3221, 3429, 0),
            new Tile(3224, 3429, 0),
            new Tile(3227, 3429, 0),
            new Tile(3230, 3429, 0),
            new Tile(3233, 3429, 0),
            new Tile(3236, 3429, 0),
            new Tile(3239, 3429, 0),
            new Tile(3242, 3429, 0),
            new Tile(3245, 3430, 0),
            new Tile(3246, 3433, 0),
            new Tile(3246, 3436, 0),
            new Tile(3245, 3439, 0),
            new Tile(3245, 3442, 0),
            new Tile(3246, 3445, 0),
            new Tile(3246, 3448, 0),
            new Tile(3246, 3451, 0),
            new Tile(3246, 3454, 0),
            new Tile(3246, 3457, 0),
            new Tile(3244, 3460, 0),
            new Tile(3244, 3463, 0),
            new Tile(3245, 3466, 0),
            new Tile(3245, 3469, 0),
            new Tile(3245, 3472, 0),
            new Tile(3245, 3475, 0),
            new Tile(3245, 3478, 0),
            new Tile(3248, 3480, 0),
            new Tile(3251, 3480, 0),
            new Tile(3254, 3480, 0),
            new Tile(3255, 3483, 0)};

    public static final Tile[] fatherToBush = {
            new Tile(3253, 3483, 0),
            new Tile(3253, 3480, 0),
            new Tile(3250, 3480, 0),
            new Tile(3247, 3480, 0),
            new Tile(3245, 3477, 0),
            new Tile(3245, 3474, 0),
            new Tile(3245, 3471, 0),
            new Tile(3245, 3468, 0),
            new Tile(3245, 3465, 0),
            new Tile(3245, 3462, 0),
            new Tile(3245, 3459, 0),
            new Tile(3245, 3456, 0),
            new Tile(3246, 3453, 0),
            new Tile(3246, 3450, 0),
            new Tile(3246, 3447, 0),
            new Tile(3246, 3444, 0),
            new Tile(3246, 3441, 0),
            new Tile(3246, 3438, 0),
            new Tile(3246, 3435, 0),
            new Tile(3246, 3432, 0),
            new Tile(3249, 3430, 0),
            new Tile(3252, 3430, 0),
            new Tile(3255, 3430, 0),
            new Tile(3258, 3430, 0),
            new Tile(3261, 3428, 0),
            new Tile(3264, 3428, 0),
            new Tile(3267, 3428, 0),
            new Tile(3270, 3428, 0),
            new Tile(3273, 3428, 0),
            new Tile(3276, 3428, 0),
            new Tile(3279, 3428, 0),
            new Tile(3282, 3428, 0),
            new Tile(3284, 3425, 0),
            new Tile(3284, 3422, 0),
            new Tile(3285, 3419, 0),
            new Tile(3285, 3416, 0),
            new Tile(3285, 3413, 0),
            new Tile(3286, 3410, 0),
            new Tile(3288, 3407, 0),
            new Tile(3290, 3404, 0),
            new Tile(3290, 3401, 0),
            new Tile(3290, 3398, 0),
            new Tile(3290, 3395, 0),
            new Tile(3290, 3392, 0),
            new Tile(3290, 3389, 0),
            new Tile(3290, 3386, 0),
            new Tile(3292, 3383, 0),
            new Tile(3293, 3380, 0),
            new Tile(3291, 3377, 0),
            new Tile(3288, 3374, 0),
            new Tile(3285, 3373, 0),
            new Tile(3282, 3373, 0),
            new Tile(3279, 3373, 0),
            new Tile(3276, 3373, 0),
            new Tile(3273, 3374, 0)};


    //Takes the long way south around cowpen to avoid the monks who kept killing me
    public static final Tile[] bushToApo = {
            new Tile(3276, 3375, 0),
            new Tile(3276, 3372, 0),
            new Tile(3274, 3369, 0),
            new Tile(3273, 3366, 0),
            new Tile(3273, 3363, 0),
            new Tile(3273, 3360, 0),
            new Tile(3273, 3357, 0),
            new Tile(3272, 3354, 0),
            new Tile(3272, 3351, 0),
            new Tile(3272, 3348, 0),
            new Tile(3271, 3345, 0),
            new Tile(3268, 3342, 0),
            new Tile(3265, 3342, 0),
            new Tile(3262, 3340, 0),
            new Tile(3259, 3340, 0),
            new Tile(3256, 3339, 0),
            new Tile(3253, 3339, 0),
            new Tile(3250, 3339, 0),
            new Tile(3247, 3339, 0),
            new Tile(3244, 3338, 0),
            new Tile(3241, 3338, 0),
            new Tile(3238, 3338, 0),
            new Tile(3235, 3338, 0),
            new Tile(3232, 3338, 0),
            new Tile(3229, 3338, 0),
            new Tile(3228, 3341, 0),
            new Tile(3227, 3344, 0),
            new Tile(3227, 3347, 0),
            new Tile(3227, 3350, 0),
            new Tile(3224, 3352, 0),
            new Tile(3221, 3354, 0),
            new Tile(3218, 3354, 0),
            new Tile(3215, 3356, 0),
            new Tile(3215, 3359, 0),
            new Tile(3216, 3362, 0),
            new Tile(3216, 3365, 0),
            new Tile(3214, 3368, 0),
            new Tile(3213, 3371, 0),
            new Tile(3212, 3374, 0),
            new Tile(3211, 3377, 0),
            new Tile(3210, 3380, 0),
            new Tile(3210, 3383, 0),
            new Tile(3210, 3386, 0),
            new Tile(3210, 3389, 0),
            new Tile(3210, 3392, 0),
            new Tile(3210, 3395, 0),
            new Tile(3210, 3398, 0),
            new Tile(3210, 3401, 0),
            new Tile(3210, 3404, 0),
            new Tile(3209, 3407, 0),
            new Tile(3206, 3407, 0),
            new Tile(3203, 3407, 0),
            new Tile(3201, 3404, 0),
            new Tile(3199, 3401, 0),
            new Tile(3196, 3400, 0),
            new Tile(3193, 3400, 0),
            new Tile(3190, 3401, 0),
            new Tile(3193, 3403, 0),
            new Tile(3196, 3404, 0)};

    public static final Tile[] apoToJuliet = {
            new Tile(3195, 3403, 0),
            new Tile(3192, 3403, 0),
            new Tile(3189, 3403, 0),
            new Tile(3186, 3403, 0),
            new Tile(3183, 3406, 0),
            new Tile(3183, 3409, 0),
            new Tile(3183, 3412, 0),
            new Tile(3182, 3415, 0),
            new Tile(3180, 3418, 0),
            new Tile(3180, 3421, 0),
            new Tile(3179, 3424, 0),
            new Tile(3176, 3427, 0),
            new Tile(3173, 3430, 0),
            new Tile(3170, 3433, 0),
            new Tile(3167, 3433, 0),
            new Tile(3164, 3433, 0),
            new Tile(3161, 3434, 0),
            new Tile(3155, 3435, 1),
            new Tile(3157, 3432, 1),
            new Tile(3157, 3429, 1),
            new Tile(3158, 3426, 1)};



    private final Walker walker = new Walker(ctx);

    @Override
    public void start(){
        chat(ROMEO);
    }

    @Override
    public void poll() {
        Player q = ctx.players.local();
        Tile end = romeoToJuliet[23];
        Tile start = romeoToJuliet[0];


        if (ctx.widgets.widget(399).component(7).component(12).textColor() == 65280) {
            log.info("DONE!");
            completion=0;
            stop();
        }


            switch (state()) {
            case FIRST:
                if (ready() && !ctx.npcs.select().id(ROMEO).viewable().isEmpty()) {
                    chat(ROMEO);
                    Condition.sleep(2000);
                    while (ctx.chat.chatting()) {
                        chat(ROMEO);
                    }
                    Condition.sleep(1000);
                    if (!ctx.chat.chatting()) {
                        log.info("STATE: ROMEO TO JULIET");
                        completion = 2;
                    }
                }

                else{
                    findRomeo();
                    Condition.sleep(1500);
                }
                break;

            case SECOND:
                if (ready()) {
                    walker.walkPath(romeoToJuliet);
                }
                Condition.sleep(1000);
                if (ready() && end.distanceTo(q) <= 1) {
                    chat(JULIET);
                    completion = 3;
                }
                break;

            case THIRD:
                if (ready()) {
                    chat(JULIET);
                    while (ctx.chat.chatting()) {
                        chat(JULIET);
                    }
                    Condition.sleep(1000);
                    if (!ctx.inventory.select().id(NOTE).isEmpty()) {
                        log.info("STATE: JULIET TO ROMEO");
                        completion = 4;
                    }
                }
                break;

            case FOURTH:
                if (ready() && start.distanceTo(q) > 15) {
                    walker.walkPathReverse(romeoToJuliet);

                Condition.sleep(1000);}

                else if (ready() && start.distanceTo(q) <= 15){
                    findRomeo();

                    if (ready() && !ctx.npcs.select().id(ROMEO).viewable().isEmpty()) {
                    chat(ROMEO);
                        if (ready() && ctx.chat.chatting() || ready() && ctx.widgets.widget(193).component(2).visible()) {
                            while (!ctx.inventory.select().id(NOTE).isEmpty()) {
                                Condition.sleep(1000);
                                if (ctx.chat.canContinue()) {
                                    ctx.chat.clickContinue();
                                } else if (!ctx.chat.chatting() && ctx.widgets.widget(193).component(2).visible()) {
                                    ctx.input.click(ctx.widgets.widget(193).component(2).centerPoint(), true);
                                } else {
                                    chat(ROMEO);
                                }

                            }
                        }
                    Condition.sleep(1000);
                    if (!ctx.chat.chatting()) {
                        completion = 5;
                            }
                        }

                    }
                break;

            case FIFTH:
                if (ready()) {
                    chat(ROMEO);
                    while (ctx.chat.chatting()) {
                        chat(ROMEO);
                    }
                    Condition.sleep(1000);
                    if (ctx.inventory.select().id(NOTE).isEmpty()) {
                        log.info("STATE: ROMEO TO FATHER");
                        completion = 6;
                    }
                }
                break;

            case SIXTH:
                if (ready()) {
                    walker.walkPath(romeoToFather);
                }
                Condition.sleep(1000);

                if (ready() && !ctx.npcs.select().id(FATHER).viewable().isEmpty()) {
                    chat(FATHER);
                    completion = 7;
                }
                break;

            case SEVENTH:
                if (ready()) {
                    chat(FATHER);
                    while (ctx.chat.chatting()) {
                        chat(FATHER);
                    }
                    Condition.sleep(2000);
                    if (!ctx.chat.chatting()) {
                        log.info("STATE: FATHER TO BUSH");
                        completion = 8;
                    }
                }
                break;

            case EIGHTH:
                if (ready()) {
                    walker.walkPath(fatherToBush);
                }
                if (ready() && !ctx.objects.select().id(BUSH).isEmpty()) {
                    GameObject bush = ctx.objects.nearest().poll();

                    if (bush.inViewport()) {
                        bush.interact("Pick");
                    } else {
                        ctx.movement.step(bush);
                        ctx.camera.turnTo(bush);
                    }


                }
                Condition.sleep(1000);
                if (!ctx.inventory.select().id(BERRY).isEmpty()) {
                    completion = 9;
                    log.info("STATE: BERRIES PICKED");
                    break;
                }
                break;

            case NINTH:
                if (ready()) {
                    walker.walkPath(bushToApo);
                }

                if (ready() && !ctx.npcs.select().id(APOTHECARY).isEmpty()) {
                    chat(APOTHECARY);
                    completion = 10;
                }
                break;

            case TENTH:
                if (ready() && !ctx.chat.chatting()) {
                    chat(APOTHECARY);
                }
                if (ready() && ctx.chat.chatting()) {
                    while (ctx.inventory.select().id(POT).isEmpty()) {
                        Condition.sleep(1000);
                        if (ctx.chat.canContinue()) {
                            ctx.chat.clickContinue();
                        } else if (!ctx.chat.chatting() && ctx.widgets.widget(193).component(2).visible()) {
                            ctx.input.click(ctx.widgets.widget(193).component(2).centerPoint(), true);
                        } else {
                            chat(APOTHECARY);
                        }

                    }
                }

                Condition.sleep(1000);
                if (!ctx.inventory.select().id(POT).isEmpty()) {
                    completion = 11;
                    log.info("STATE: APOTHECARY TO JULIET");
                }
                break;

            case ELEVEN:
                if (ready() && !ctx.chat.chatting()) {
                    walker.walkPath(apoToJuliet);
                }
                Condition.sleep(1000);
                if (ready() && end.distanceTo(q) <= 2) {
                    chat(JULIET);


                while (!ctx.inventory.select().id(POT).isEmpty()) {
                    Condition.sleep(2000);
                        if (ctx.chat.canContinue()) {
                            ctx.chat.clickContinue();
                        }
                        else if (!ctx.chat.chatting() && ctx.widgets.widget(193).component(2).visible()) {
                            ctx.input.click(ctx.widgets.widget(193).component(2).centerPoint(), true);
                            Condition.sleep(2500);
                        }
                        else if (!ctx.chat.chatting() && ctx.widgets.widget(231).component(2).visible()) {
                            ctx.input.click(ctx.widgets.widget(231).component(2).centerPoint(), true);
                            Condition.sleep(2500);
                        }
                        else {
                            chat(JULIET);
                        }

                        }
                }
                if (ready() && ctx.inventory.select().id(POT).isEmpty()) {
                    log.info("STATE: JULIET TO ROMEO AGAIN");
                    completion = 12;
                }


                break;

            case TWELVE:
                if (ready()) {
                    walker.walkPathReverse(romeoToJuliet);
                }
                Condition.sleep(1000);

                if (ready() && start.distanceTo(q) <= 3) {
                    completion = 13;
                }

                break;

            case THIRTEEN:
                if (ready() && ctx.npcs.select().id(ROMEO).viewable().isEmpty()) {
                    findRomeo();

                }
                else if (ready() && !ctx.npcs.select().id(ROMEO).viewable().isEmpty()){
                    chat(ROMEO);
                    log.info("CHATTING ROMEO");
                    if (ctx.chat.chatting()) {
                        while (ctx.widgets.widget(399).component(7).component(12).textColor() != 65280) {

                            checkComplete();
                            if (ctx.chat.canContinue()) {
                                ctx.chat.clickContinue();
                            } else if (!ctx.chat.chatting() && ctx.widgets.widget(193).component(2).visible()) {
                                ctx.input.click(ctx.widgets.widget(193).component(2).centerPoint(), true);
                                Condition.sleep(2500);
                            } else if (!ctx.chat.chatting() && ctx.widgets.widget(231).component(2).visible()) {
                                ctx.input.click(ctx.widgets.widget(231).component(2).centerPoint(), true);
                                Condition.sleep(2500);
                            } else {
                                chat(ROMEO);
                            }


                        }
                    }
                }





        }
    }
    private enum State {NOT_USED,FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH, TENTH, ELEVEN, TWELVE, THIRTEEN}

    private State state() {

        switch (completion){
            case 1:
                return State.FIRST;
            case 2:
                return State.SECOND;
            case 3:
                return State.THIRD;
            case 4:
                return State.FOURTH;
            case 5:
                return  State.FIFTH;
            case 6:
                return State.SIXTH;
            case 7:
                return State.SEVENTH;
            case 8:
                return State.EIGHTH;
            case 9:
                return State.NINTH;
            case 10:
                return State.TENTH;
            case 11:
                return State.ELEVEN;
            case 12:
                return State.TWELVE;
            case 13:
                return State.THIRTEEN;
        }



            return State.NOT_USED;

        }


    public boolean ready() {

        if (!ctx.players.local().inMotion() || ctx.movement.destination().equals(Tile.NIL) || ctx.movement.destination().distanceTo(ctx.players.local()) < 5) {
            if(ctx.movement.energyLevel() >= 50 && !ctx.movement.running()){
                ctx.movement.running(true);
            }
            return true;
        }
        return false;
    }

    private void chat(int x){

        if (!ctx.chat.chatting()) {
            final Npc quest = ctx.npcs.select().id(x).nearest().poll();
            if (quest.interact("Talk")){
                Condition.wait(new Callable<Boolean>() {
                    @Override
                    public Boolean call() throws Exception {
                        return ctx.chat.chatting();
                    }
                }, 350, 10);
            }
        }

        else if (ctx.chat.canContinue()) {
            ctx.chat.clickContinue();
            Condition.sleep(Random.nextInt(400,550));
        }

        else if (!ctx.chat.select().text(CHAT_OPTIONS).isEmpty()) {
            final ChatOption option = ctx.chat.poll();

            if (option.select()) {
                Condition.wait(new Callable<Boolean>() {
                    @Override
                    public Boolean call() throws Exception {
                        return !option.valid();
                    }
                }, 250,10);
            }
        }

    }

    private boolean findRomeo(){
        final Tile[] find = {
                new Tile(3213, 3426, 0),
                new Tile(3214, 3423, 0),
                new Tile(3217, 3421, 0),
                new Tile(3217, 3418, 0),
                new Tile(3214, 3416, 0),
                new Tile(3211, 3415, 0),
                new Tile(3208, 3415, 0),
                new Tile(3205, 3417, 0),
                new Tile(3208, 3415, 0),
                new Tile(3211, 3415, 0),
                new Tile(3211, 3418, 0),

                };

        log.info("FINDING ROMEO");

        if(ready() && ctx.npcs.select().id(ROMEO).viewable().isEmpty()){
            walker.walkPath(find);
            return false;
        }

        else{
            log.info("FOUND HIM");
            ctx.camera.turnTo(ctx.npcs.select().id(ROMEO).poll());}
            return true;

            }

    private void checkComplete(){

        if (ctx.widgets.widget(277).component(1).visible()) {
            log.info("STATE: COMPLETE!");
            completion=0;
            stop();
        }
    }

}


