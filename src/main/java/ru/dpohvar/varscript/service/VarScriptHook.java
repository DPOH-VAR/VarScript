package ru.dpohvar.varscript.service;

import ru.dpohvar.varscript.VarScript;

public interface VarScriptHook {

    public void onEnable(VarScript plugin);

    public void onDisable(VarScript plugin);

}
